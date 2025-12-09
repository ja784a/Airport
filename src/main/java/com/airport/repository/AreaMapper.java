package com.airport.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.airport.domain.flights.model.Area;

@Mapper
public interface AreaMapper {
	public List<Area> selectDomAreas();
	
	public List<Area> selectIntAreas();
	
	public List<Area> selectAreas();
}