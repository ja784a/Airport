package ja784a.ukb.domain.flights.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ja784a.ukb.domain.flights.model.Area;
import ja784a.ukb.domain.flights.service.AreaService;
import ja784a.ukb.repository.AreaMapper;

@Service
public class AreaServiceImpl implements AreaService {
	@Autowired
	private AreaMapper mapper;
	
	public List<Area> getDomAreas() {
		return mapper.selectDomAreas();
	}
	
	public List<Area> getIntAreas() {
		return mapper.selectIntAreas();
	}
	
	public List<Area> getAreas() {
		return mapper.selectAreas();
	}
}