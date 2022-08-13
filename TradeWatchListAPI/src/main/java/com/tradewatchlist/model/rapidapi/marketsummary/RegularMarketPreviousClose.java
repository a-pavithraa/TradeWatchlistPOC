package com.tradewatchlist.model.rapidapi.marketsummary;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class RegularMarketPreviousClose implements Serializable {
	
	 private double raw;
	 private String fmt;

}
