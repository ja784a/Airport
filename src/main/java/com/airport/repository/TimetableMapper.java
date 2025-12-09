package com.airport.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.airport.domain.flights.model.Timetable;

@Mapper
public interface TimetableMapper {
	public List<Timetable> selectFlightsByTime();
	
	public void insertFlight(Timetable timetable);
	
	public List<Timetable> selectAllFlights();
	
	public Timetable selectFlight(int id);
	
	public void updateFlight(Timetable timetable);
	
	public List<Timetable> selectFlightsBfo5Min();
	
	public void deleteFlight(int id);
}