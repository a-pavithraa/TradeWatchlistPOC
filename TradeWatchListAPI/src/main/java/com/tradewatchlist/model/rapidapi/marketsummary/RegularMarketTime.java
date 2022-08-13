package com.tradewatchlist.model.rapidapi.marketsummary;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class RegularMarketTime implements Serializable {
	private int raw;
    private String fmt;
}
