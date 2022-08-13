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
@Table(name = "TrendingTickers")
@AllArgsConstructor
@NoArgsConstructor
public class TrendingTickers {
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trending_seq")
	@SequenceGenerator(name="trending_seq", sequenceName = "trending_sequence")
	private Long id;
	private String symbol;
	private String shortName;
	private double previousClose;
	private double changePercent;
	private double customPriceAlertConfidence;
	private String fullExchangeName;
	private String region;

}
