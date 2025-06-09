package ja784a.ukb.domain.flights.service;

import java.util.List;

import ja784a.ukb.domain.flights.model.Timetable;

public interface TimetableService {
	public List<Timetable> getTimetableByTime();
	
	public void addFlight(Timetable timetable);
	
	public List<Timetable> getAllFlights();
	
	public Timetable getFlight(int id);
	
	public void updateFlight(Timetable timetable);
}