package ja784a.ukb.domain.flights.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ja784a.ukb.domain.flights.model.Airline;
import ja784a.ukb.domain.flights.service.AirlineService;
import ja784a.ukb.repository.AirlineMapper;


@Service
public class AirlineServiceImpl implements AirlineService {
	@Autowired
	private AirlineMapper mapper;
	
	public List<Airline> getAirlines() {
		return mapper.selectAirlines();
	}
	
}