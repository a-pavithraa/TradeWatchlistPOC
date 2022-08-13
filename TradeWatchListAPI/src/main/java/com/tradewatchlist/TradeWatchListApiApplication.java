package com.tradewatchlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import com.tradewatchlist.api.rapidapi.RapidApiClient;

@SpringBootApplication
@EnableFeignClients(
	    basePackageClasses = {	
	    		RapidApiClient.class
	    		
	    })
public class TradeWatchListApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeWatchListApiApplication.class, args);
	}

}
