package ja784a.ukb.domain.flights.model;

import java.time.LocalTime;

import lombok.Data;

@Data
public class Timetable {
	private int id;
	private int airlineId;
	private LocalTime deptTime;
	private LocalTime newDeptTime;
	private int flight;
	private int destId;
	private int gate;
	private int remarkId;
	private Airline airline;
	private Dest dest;
	private Remark remark;
}