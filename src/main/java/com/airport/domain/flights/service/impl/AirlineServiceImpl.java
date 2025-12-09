package com.airport.domain.flights.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airport.domain.flights.model.Airline;
import com.airport.domain.flights.service.AirlineService;
import com.airport.repository.AirlineMapper;


@Service
public class AirlineServiceImpl implements AirlineService {
	@Autowired
	private AirlineMapper mapper;
	
	public List<Airline> getAirlines() {
		return mapper.selectAirlines();
	}
	
	public Airline getAirline(int id) {
		return mapper.selectAirline(id);
	}
	
	public void addAirline(Airline airline) {
		mapper.insertAirline(airline);
	}
	
	public void updateAirline(Airline airline) {
		mapper.updateAirline(airline);
	}
	
	public void deleteAirline(int id) {
		mapper.deleteAirline(id);
	}
}