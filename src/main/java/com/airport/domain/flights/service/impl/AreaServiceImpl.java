package com.airport.domain.flights.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airport.domain.flights.model.Area;
import com.airport.domain.flights.service.AreaService;
import com.airport.repository.AreaMapper;

@Service
public class AreaServiceImpl implements AreaService {
	@Autowired
	private AreaMapper mapper;
	
	public List<Area> getDomAreas() {
		return mapper.selectDomAreas();
	}
	
	public List<Area> getIntAreas() {
		return mapper.selectIntAreas();
	}
	
	public List<Area> getAreas() {
		return mapper.selectAreas();
	}
}