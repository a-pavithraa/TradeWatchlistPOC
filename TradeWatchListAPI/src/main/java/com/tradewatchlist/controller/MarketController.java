package com.tradewatchlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tradewatchlist.model.MarketSummaryVM;
import com.tradewatchlist.model.SymbolVM;
import com.tradewatchlist.model.TrendingTickerVM;
import com.tradewatchlist.model.rapidapi.chart.ChartDetails;
import com.tradewatchlist.service.MarketDetailstRetrievalService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
@Tag(name="Market and Stock APIs for Consumption")
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
	
	@GetMapping("/symbols/{region}")
	public List<SymbolVM> getMatchingSymbols(@PathVariable String region, @RequestParam String name){
		return marketDetailstRetrievalService.getSymbols(region, name);
	}
	
	@GetMapping("/chart")
	public ChartDetails getChart( @RequestParam String symbol, @RequestParam(defaultValue = "60m") String interval,@RequestParam(defaultValue = "1d") String range,@RequestParam(defaultValue = "US") String region){
		 return marketDetailstRetrievalService.getChartDetails(symbol, interval, range, region);
	}
	
	
	
	
	

	 
}
