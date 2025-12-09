package com.airport.domain.flights.service;

import java.util.List;

import com.airport.domain.flights.model.Announce;
import com.airport.domain.flights.model.Timetable;

public interface TimetableService {
	public List<Timetable> getTimetableByTime();
	
	public void addFlight(Timetable timetable);
	
	public List<Timetable> getAllFlights();
	
	public Timetable getFlight(int id);
	
	public void updateFlight(Timetable timetable);
	
	public List<Announce> getAnnounceBfo5Min();
	
	public void deleteFlight(int id);
}