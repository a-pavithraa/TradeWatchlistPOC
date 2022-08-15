package com.tradewatchlist.model.iex;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IexSymbolResponse {
	private List<SymbolApiResponse> symbols;

}
