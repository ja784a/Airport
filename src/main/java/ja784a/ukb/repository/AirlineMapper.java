package ja784a.ukb.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ja784a.ukb.domain.flights.model.Airline;

@Mapper
public interface AirlineMapper {
	public List<Airline> selectAirlines();
	
	public Airline selectAirline(int id);
	
	public void insertAirline(Airline airline);
	
	public void updateAirline(Airline airline);
}