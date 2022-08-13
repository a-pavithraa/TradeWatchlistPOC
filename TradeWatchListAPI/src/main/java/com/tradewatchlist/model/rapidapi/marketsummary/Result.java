package com.tradewatchlist.model.rapidapi.marketsummary;



import java.io.Serializable;

import lombok.Data;

@Data
public class Result implements Serializable{
	 private String fullExchangeName;
	    private String exchangeTimezoneName;
	    private String symbol;
	    private int gmtOffSetMilliseconds;
	    private Object firstTradeDateMilliseconds;
	    private int exchangeDataDelayedBy;
	    private String language;
	    private RegularMarketTime regularMarketTime;
	    private String exchangeTimezoneShortName;
	    private String quoteType;
	    private String marketState;
	    private String customPriceAlertConfidence;
	    private String market;
	    private Spark spark;
	    private int priceHint;
	    private boolean tradeable;
	    private int sourceInterval;
	    private String exchange;
	    private String shortName;
	    private String region;
	    private RegularMarketPreviousClose regularMarketPreviousClose;
	    private boolean triggerable;

}
