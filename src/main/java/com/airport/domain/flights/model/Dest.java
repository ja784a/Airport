
package com.airport.domain.flights.model;

import lombok.Data;

@Data
public class Dest {
	private int id;
	private String destJp;
	private String destEg;
	private String sDestJp;
	private String sDestEg;
	private int areaId;
	private Area area;
}