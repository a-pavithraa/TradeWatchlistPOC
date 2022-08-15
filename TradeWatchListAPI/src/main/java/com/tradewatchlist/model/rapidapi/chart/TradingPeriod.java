package com.tradewatchlist.model.rapidapi.chart;

import java.io.Serializable;

import lombok.Data;

@Data
public class TradingPeriod implements Serializable {
	   private String timezone;
	    private long start;
	    private long end;
	    private long gmtoffset;

}
