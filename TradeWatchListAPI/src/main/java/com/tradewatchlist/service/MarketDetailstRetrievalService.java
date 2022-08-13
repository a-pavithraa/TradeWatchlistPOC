package com.tradewatchlist.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tradewatchlist.model.MarketSummaryVM;
import com.tradewatchlist.model.TrendingTickerVM;
import com.tradewatchlist.repository.MarketSummaryRepo;
import com.tradewatchlist.repository.TrendingTickersRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MarketDetailstRetrievalService {
	
	private TrendingTickersRepo trendingTickersRepo;
	private MarketSummaryRepo marketSummaryRepo;
	
	public List<TrendingTickerVM> getTrendingTickers(String region){
		return trendingTickersRepo.findByRegion(region);
		
	}
	
	public List<MarketSummaryVM> getMarketSummary(String region){
		return marketSummaryRepo.findByRegion(region);
		
	}
}
