package com.airport.domain.flights.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airport.domain.flights.model.Announce;
import com.airport.domain.flights.model.Timetable;
import com.airport.domain.flights.service.TimetableService;
import com.airport.repository.TimetableMapper;

@Service
public class TimetableServiceImpl implements TimetableService {
	@Autowired
	private TimetableMapper mapper;
	
	public List<Timetable> getTimetableByTime() {
		return mapper.selectFlightsByTime();
	}
	
	public void addFlight(Timetable timetable) {
		mapper.insertFlight(timetable);
	}
	
	public List<Timetable> getAllFlights() {
		return mapper.selectAllFlights();
	}
	
	public Timetable getFlight(int id) {
		return mapper.selectFlight(id);
	}
	
	public void updateFlight(Timetable timetable) {
		mapper.updateFlight(timetable);
	}
	
	public List<Announce> getAnnounceBfo5Min() {
		List<Announce> texts = new ArrayList<>();
		List<Timetable> flights = mapper.selectFlightsBfo5Min();
		for (Timetable f : flights) {
			String text = f.getAirline().getSAirlineJp() + "、" + f.getFlight() + "、びん、" +
			f.getDest().getSDestJp() 
			+ "、行きは、只今ご搭乗の最終案内をいたしております、" 
			+ "お客様は、" + f.getGate() + "番ゲートより、お急ぎご搭乗ください、";
			String textEg = "This is the final boarding call, for " + f.getAirline().getSAirlineEg() + "flight," + 
					f.getFlight() + ", departing for, " + f.getDest().getSDestEg() + ", Passengers on this flight, " + 
					"Pleash proceed to gate, " + f.getGate() + ", immediately, Thank you.";
			Announce text1 = new Announce();
			text1.setText(text);
			text1.setTextEg(textEg);
			texts.add(text1);
		}
		return texts;	
	}
	
	public void deleteFlight(int id) {
		mapper.deleteFlight(id);
	}
}