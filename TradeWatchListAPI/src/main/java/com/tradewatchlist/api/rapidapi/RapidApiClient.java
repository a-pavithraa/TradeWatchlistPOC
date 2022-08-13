package com.tradewatchlist.api.rapidapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tradewatchlist.api.FeignConfig;
import com.tradewatchlist.model.rapidapi.marketsummary.MarketSummaryApiResponse;
import com.tradewatchlist.model.rapidapi.trendingticker.TrendingTicker;

@FeignClient(name = "rapidApi", url = "${restapi.rapidapi.url}", configuration = { FeignConfig.class,
		RapidAPIFeignConfig.class })
public interface RapidApiClient {
	@RequestMapping(method = RequestMethod.GET, value = "/market/get-trending-tickers", consumes = "application/json")
	TrendingTicker getTrendingTickers(@RequestParam(value="region")String region);

	@RequestMapping(method = RequestMethod.GET, value = "/market/v2/get-summary", consumes = "application/json")
	MarketSummaryApiResponse getMarketSummary(@RequestParam(value="region")String region);

}
