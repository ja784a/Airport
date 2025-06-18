package ja784a.ukb.domain.flights.service.impl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ja784a.ukb.domain.flights.model.Timetable;
import ja784a.ukb.domain.flights.service.TimetableService;
import ja784a.ukb.repository.TimetableMapper;

@Service
public class TimetableServiceImpl implements TimetableService {
	@Autowired
	private TimetableMapper mapper;
	
	public List<Timetable> getTimetableByTime() {
		return mapper.selectFlightsByTime();
	}
	
	public void addFlight(Timetable timetable) {
		Random random = new Random();
		timetable.setFlight(random.nextInt(1999) + 1);
		timetable.setGate(random.nextInt(29) + 1);
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
}