package com.tradewatchlist.model.rapidapi.trendingticker;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class Finance implements Serializable{
	 public List<Result> result;
	 public Object error;
	}