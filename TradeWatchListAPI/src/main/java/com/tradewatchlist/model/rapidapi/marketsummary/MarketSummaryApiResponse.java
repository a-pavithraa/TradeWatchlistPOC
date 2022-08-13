package com.tradewatchlist.model.rapidapi.marketsummary;

import java.io.Serializable;

import lombok.Data;

@Data
public class MarketSummaryApiResponse implements Serializable{
	
	private MarketSummaryAndSparkResponse marketSummaryAndSparkResponse;

}
