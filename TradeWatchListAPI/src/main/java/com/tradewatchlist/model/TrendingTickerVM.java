package com.tradewatchlist.model;

public interface TrendingTickerVM {
	String getSymbol();
	String getShortName();
	double getPreviousClose();
	double getChangePercent();
	double getCustomPriceAlertConfidence();
	String getFullExchangeName();

}
