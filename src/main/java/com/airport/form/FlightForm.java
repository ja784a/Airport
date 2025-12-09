package com.airport.form;

import java.time.LocalTime;

import lombok.Data;

@Data
public class FlightForm {
	private int id;
	private int airlineId;
	private LocalTime deptTime;
	private LocalTime newDeptTime;
	private int flight;
	private int destId;
	private int gate;
	private int remarkId;
}