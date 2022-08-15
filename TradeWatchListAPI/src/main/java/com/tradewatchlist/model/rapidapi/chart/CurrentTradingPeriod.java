package com.tradewatchlist.model.rapidapi.chart;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class CurrentTradingPeriod implements Serializable{
    private TradingPeriod pre;
    private TradingPeriod regular;
    private TradingPeriod post;
}

