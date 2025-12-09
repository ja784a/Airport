package com.airport.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.airport.domain.flights.model.Remark;

@Mapper
public interface RemarkMapper {
	public List<Remark> selectRemarks();
}