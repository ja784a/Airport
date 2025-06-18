package ja784a.ukb.domain.flights.service;

import java.util.List;

import ja784a.ukb.domain.flights.model.Area;

public interface AreaService {
	public List<Area> getDomAreas();
	
	public List<Area> getIntAreas();
}