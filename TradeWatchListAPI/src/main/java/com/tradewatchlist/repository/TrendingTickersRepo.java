package com.tradewatchlist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tradewatchlist.entity.MarketSummary;
import com.tradewatchlist.entity.TrendingTickers;
import com.tradewatchlist.model.TrendingTickerVM;



public interface TrendingTickersRepo  extends JpaRepository<TrendingTickers, Long>{
	
	public List<TrendingTickerVM> findByRegion(String region);
	
	public void deleteByRegion(String region);

}
