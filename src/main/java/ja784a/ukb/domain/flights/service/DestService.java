package ja784a.ukb.domain.flights.service;

import java.util.List;

import ja784a.ukb.domain.flights.model.Dest;

public interface DestService {
	public List<Dest> getDests();
	
	public void addDest(Dest dest);
	
	public Dest getDest(Integer id);
	
	public void updateDest(Dest dest);
}