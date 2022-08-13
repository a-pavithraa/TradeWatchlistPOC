package com.tradewatchlist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tradewatchlist.entity.MarketSummary;
import com.tradewatchlist.model.MarketSummaryVM;

public interface MarketSummaryRepo extends JpaRepository<MarketSummary, Long>{
	public List<MarketSummaryVM> findByRegion(String region);
	
	public void deleteByRegion(String region);

}
