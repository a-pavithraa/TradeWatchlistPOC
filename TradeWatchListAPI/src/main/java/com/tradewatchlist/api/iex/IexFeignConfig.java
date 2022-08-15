package com.tradewatchlist.api.iex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;



import feign.RequestInterceptor;

public class IexFeignConfig {
	@Value("${restapi.iex.apikey}")
	private String apiKey;
	private static final Logger logger = LoggerFactory.getLogger(IexFeignConfig.class);

	@Bean
	public RequestInterceptor iexFeignRequestInterceptor() {

		logger.debug("inside feign config iex key:{}", apiKey);
		return t -> t.query("token", apiKey);
	}

}
