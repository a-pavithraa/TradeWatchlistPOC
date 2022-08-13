package com.tradewatchlist.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "MarketSummary")
@AllArgsConstructor
@NoArgsConstructor
public class MarketSummary {
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "market_summary_seq")
	@SequenceGenerator(name="market_summary_seq", sequenceName = "market_summary_sequence")
	private Long id;
	private String symbol;
	private String shortName;
	private double previousClose;
	private double priceHint;	
	private String fullExchangeName;
	private String region;

}
