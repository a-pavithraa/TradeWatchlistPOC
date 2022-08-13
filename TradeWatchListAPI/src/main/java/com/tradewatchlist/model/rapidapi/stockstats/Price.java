package com.tradewatchlist.model.rapidapi.stockstats;

import java.io.Serializable;

import lombok.Data;

@Data
public class Price implements Serializable {
	
	private double raw;
	private double fmt;
	private double longFmt;

}
