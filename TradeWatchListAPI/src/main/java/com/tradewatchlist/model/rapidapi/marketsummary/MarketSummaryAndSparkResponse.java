package com.tradewatchlist.model.rapidapi.marketsummary;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class MarketSummaryAndSparkResponse implements Serializable{
	
	  private List<Result> result;
	  private Object error;

}
