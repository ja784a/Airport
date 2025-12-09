package com.airport.domain.flights.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airport.domain.flights.model.Remark;
import com.airport.domain.flights.service.RemarkService;
import com.airport.repository.RemarkMapper;

@Service
public class RemarkServiceImpl implements RemarkService {
	@Autowired
	private RemarkMapper mapper;
	
	public List<Remark> getRemarks() {
		return mapper.selectRemarks();
	}
}