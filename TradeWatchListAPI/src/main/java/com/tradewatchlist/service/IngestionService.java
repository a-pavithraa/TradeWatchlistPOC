package com.tradewatchlist.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tradewatchlist.api.iex.IexAPIRestClient;
import com.tradewatchlist.api.rapidapi.RapidApiClient;

import com.tradewatchlist.entity.MarketSummary;
import com.tradewatchlist.entity.TrendingTickers;
import com.tradewatchlist.model.iex.SymbolApiResponse;
import com.tradewatchlist.model.rapidapi.marketsummary.MarketSummaryApiResponse;
import com.tradewatchlist.model.rapidapi.trendingticker.TrendingTicker;
import com.tradewatchlist.repository.MarketSummaryRepo;
import com.tradewatchlist.repository.SymbolsRepo;
import com.tradewatchlist.repository.TrendingTickersRepo;


import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class IngestionService {
	
	private RapidApiClient rapidApiClient;
	private IexAPIRestClient iexClient;
	private TrendingTickersRepo trendingTickersRepo;
	private MarketSummaryRepo marketSummaryRepo;
	private SymbolsRepo symbolRepo;
	
	@Transactional
	public void refreshTrendingTickers(String region) {
	// delete the existing records and then insert the tickers that are trending the current day
	trendingTickersRepo.deleteByRegion(region);
	TrendingTicker trendingTicker=rapidApiClient.getTrendingTickers(region);
	trendingTicker.finance.result.stream().forEach(result->{
	List<TrendingTickers> trendingTickersList =result.quotes.stream().map(quote->{
			TrendingTickers trendingTickers = new TrendingTickers();
			trendingTickers.setSymbol(quote.getSymbol());
			trendingTickers.setChangePercent(quote.getRegularMarketChangePercent());
			trendingTickers.setShortName(quote.getShortName());
			trendingTickers.setFullExchangeName(quote.getFullExchangeName());
			trendingTickers.setPreviousClose(quote.getRegularMarketPreviousClose());
			trendingTickers.setRegion(region);
			
			return trendingTickers;
		}).collect(Collectors.toList());
		trendingTickersRepo.saveAll(trendingTickersList);
		
	});
		
		
	}

	@Transactional
	public void refreshMarketSummary(String region) {
		marketSummaryRepo.deleteByRegion(region);
		MarketSummaryApiResponse marketSummaryApiResponse=rapidApiClient.getMarketSummary(region);
		List<MarketSummary> marketSummaryList =marketSummaryApiResponse.getMarketSummaryAndSparkResponse().getResult().stream().map(result->{
			MarketSummary marketSummary = new MarketSummary();
			marketSummary.setFullExchangeName(result.getFullExchangeName());
			marketSummary.setPreviousClose(result.getRegularMarketPreviousClose().getRaw());
			marketSummary.setPriceHint(result.getPriceHint());
			marketSummary.setSymbol(result.getSymbol());
			marketSummary.setShortName(result.getShortName());
			marketSummary.setRegion(region);
			return marketSummary;
			
		}).collect(Collectors.toList());
		marketSummaryRepo.saveAll(marketSummaryList);
		
		
	}
	
	@Transactional
	public void saveSymbols() {
		List<SymbolApiResponse> symbolsApiResponse = iexClient.getSymbols(); 
		ModelMapper mapper = new ModelMapper();
		List<com.tradewatchlist.entity.Symbol> symbols =mapper.map(symbolsApiResponse, new TypeToken<List<com.tradewatchlist.entity.Symbol>>(){}.getType());		
		symbolRepo.saveAll(symbols);
		
	}
	

}
