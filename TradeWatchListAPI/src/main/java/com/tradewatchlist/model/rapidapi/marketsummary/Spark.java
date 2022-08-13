package com.tradewatchlist.model.rapidapi.marketsummary;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class Spark implements Serializable {
	 private List<Integer> timestamp;
	    private String symbol;
	    private double chartPreviousClose;
	    private int dataGranularity;
	    private int end;
	    private int start;
	    private double previousClose;
	    private List<Double> close;
}
