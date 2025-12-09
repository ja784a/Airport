package com.airport.domain.flights.service;

import java.util.List;

import com.airport.domain.flights.model.Area;

public interface AreaService {
	public List<Area> getDomAreas();
	
	public List<Area> getIntAreas();
	
	public List<Area> getAreas();
}