package com.airport.domain.flights.service;

import java.util.List;

import com.airport.domain.flights.model.Airline;

public interface AirlineService {
	public List<Airline> getAirlines();
	
	public Airline getAirline(int id);
	
	public void addAirline(Airline airline);
	
	public void updateAirline(Airline airline);
	
	public void deleteAirline(int id);
}