package com.airport.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.airport.domain.flights.model.Dest;

@Mapper
public interface DestMapper {
	public List<Dest> selectDests();
	
	public void insertDest(Dest dest);
	
	public Dest selectDest(Integer id);
	
	public void updateDest(Dest dest);
	
	public void deleteDest(int id);
}