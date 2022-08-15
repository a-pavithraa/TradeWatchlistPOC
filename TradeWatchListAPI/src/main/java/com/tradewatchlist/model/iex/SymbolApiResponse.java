package com.tradewatchlist.model.iex;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class SymbolApiResponse {
	
	
	private String name;
	private String exchange;
	private String exchangeName;
	private String symbol;
	private String region;
	private String currency;

}
