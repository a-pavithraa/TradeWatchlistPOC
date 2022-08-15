package com.tradewatchlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.tradewatchlist.api.iex.IexAPIRestClient;
import com.tradewatchlist.api.rapidapi.RapidApiClient;

@SpringBootApplication
@EnableFeignClients(
	    basePackageClasses = {	
	    		RapidApiClient.class,
	    		IexAPIRestClient.class
	    		
	    })
public class TradeWatchListApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeWatchListApiApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("*").allowedOrigins("*").allowedMethods("*").allowedHeaders("*");
			}
		};
	}


}
