package com.tradewatchlist.api.rapidapi;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import com.tradewatchlist.api.FeignErrorDecoder;

import feign.RequestInterceptor;
import feign.Retryer;
import feign.codec.ErrorDecoder;

public class RapidAPIFeignConfig {
	@Value("${restapi.rapidapi.apikey}")
	private String apiKey;
	@Value("${restai.rapidapi.host}")
	private String host;
	private static final Logger logger = LoggerFactory.getLogger(RapidAPIFeignConfig.class);

	
	  @Bean
	  public RequestInterceptor feignRequestInterceptor() {
		
	    return t -> t.header("x-rapidapi-key", apiKey).header("x-rapidapi-host", host);
	  }

	  


}
