package com.tradewatchlist.model;

public interface MarketSummaryVM {
	String getSymbol();
	String getShortName();
	double getPreviousClose();	
	double getPriceHint();
	String getFullExchangeName();

}
