package com.tradewatchlist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tradewatchlist.service.IngestionService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/ingestion")
@Tag(name = "APIs for Data Ingestion")
public class IngestionController {
	@Autowired
	private IngestionService ingestionService;

	@PostMapping("/trendingTickers/{region}")
	@ResponseStatus(HttpStatus.CREATED)
	public void updateTrendingTickers(@PathVariable String region) {
		ingestionService.refreshTrendingTickers(region);

	}

	@PostMapping("/marketSummary/{region}")
	@ResponseStatus(HttpStatus.CREATED)
	public void updateMarketSummary(@PathVariable String region) {
		ingestionService.refreshMarketSummary(region);

	}

	@PostMapping("/symbols")
	@ResponseStatus(HttpStatus.CREATED)
	public void insertSymbolsData() {

		ingestionService.saveSymbols();
	}

}
