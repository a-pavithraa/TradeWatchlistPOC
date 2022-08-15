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
@Table(name = "Symbol")
@AllArgsConstructor
@NoArgsConstructor
public class Symbol {
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sym_seq")
	@SequenceGenerator(name="sym_seq", sequenceName = "symbol_sequence")
	private Long id;
	private String name;
	private String exchange;
	private String exchangeName;
	private String symbol;
	private String region;
	private String currency;
	

}
