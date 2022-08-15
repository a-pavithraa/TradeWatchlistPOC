package com.tradewatchlist.api.iex;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tradewatchlist.api.FeignConfig;
import com.tradewatchlist.model.iex.SymbolApiResponse;





@FeignClient(
	    name = "iex",
	    url = "${restapi.iex.url}",
	    configuration = {FeignConfig.class,IexFeignConfig.class})
public interface IexAPIRestClient {
	
	 @RequestMapping(
		      method = RequestMethod.GET,
		      value = "beta/ref-data/symbols",
		      consumes = "application/json")
	 List<SymbolApiResponse> getSymbols();

}
