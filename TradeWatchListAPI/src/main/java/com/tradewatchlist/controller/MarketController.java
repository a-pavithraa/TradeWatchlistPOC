package com.tradewatchlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tradewatchlist.model.MarketSummaryVM;
import com.tradewatchlist.model.TrendingTickerVM;
import com.tradewatchlist.service.MarketDetailstRetrievalService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api")
@Tag(name="MarketDetails")
public class MarketController {
	@Autowired
	private MarketDetailstRetrievalService marketDetailstRetrievalService;
	
	@GetMapping("/trendingTickers/{region}")
	public List<TrendingTickerVM> getTrendingTickers(@PathVariable String region){
		return marketDetailstRetrievalService.getTrendingTickers(region);
		
	}
	
	@GetMapping("/marketSummary/{region}")
	public List<MarketSummaryVM> getMarketSummary(@PathVariable String region){
		return marketDetailstRetrievalService.getMarketSummary(region);
		
	}
	

	 
}
