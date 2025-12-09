package com.airport.domain.flights.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airport.domain.flights.model.Dest;
import com.airport.domain.flights.service.DestService;
import com.airport.repository.DestMapper;

@Service
public class DestServiceImpl implements DestService {
	@Autowired
	private DestMapper mapper;
	
	@Override
	public List<Dest> getDests() {
		return mapper.selectDests();
	}
	
	@Override
	public void addDest(Dest dest) {
		mapper.insertDest(dest);
	}
	
	@Override
	public Dest getDest(Integer id) {
		return mapper.selectDest(id);
	}
	
	@Override
	public void updateDest(Dest dest) {
		mapper.updateDest(dest);
	}
	
	@Override
	public void deleteDest(int id) {
		mapper.deleteDest(id);
	}
}