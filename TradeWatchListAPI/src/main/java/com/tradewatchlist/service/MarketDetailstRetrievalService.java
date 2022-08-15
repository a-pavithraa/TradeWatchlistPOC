package com.tradewatchlist.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tradewatchlist.api.rapidapi.RapidApiClient;
import com.tradewatchlist.model.MarketSummaryVM;
import com.tradewatchlist.model.SymbolVM;
import com.tradewatchlist.model.TrendingTickerVM;
import com.tradewatchlist.model.rapidapi.chart.ChartDetails;
import com.tradewatchlist.repository.MarketSummaryRepo;
import com.tradewatchlist.repository.SymbolsRepo;
import com.tradewatchlist.repository.TrendingTickersRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MarketDetailstRetrievalService {
	
	private TrendingTickersRepo trendingTickersRepo;
	private MarketSummaryRepo marketSummaryRepo;
	private SymbolsRepo symbolRepo;
	private RapidApiClient rapidApiClient;
	
	public List<TrendingTickerVM> getTrendingTickers(String region){
		return trendingTickersRepo.findByRegion(region);
		
	}
	
	public List<MarketSummaryVM> getMarketSummary(String region){
		return marketSummaryRepo.findByRegion(region);
		
	}
	
	public List<SymbolVM> getSymbols(String region,String name){
		return symbolRepo.findByNameStartsWithIgnoreCaseAndRegion(name, region);
		
	}
	
	public ChartDetails getChartDetails(String symbol,String interval,String range,String region) {
		return rapidApiClient.getChartListForSymbol(symbol, interval, range, region);
		
	}
}
