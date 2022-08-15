package com.tradewatchlist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tradewatchlist.entity.Symbol;
import com.tradewatchlist.model.SymbolVM;


public interface SymbolsRepo extends JpaRepository<Symbol, Long>{
	
	

public List<SymbolVM> findByNameStartsWithIgnoreCaseAndRegion(String name,String region);

}