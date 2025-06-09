package ja784a.ukb.domain.flights.model;

import lombok.Data;

@Data
public class Airline {
	private int id;
	private String airlineName;
	private String logo;
	private String sAirlineJp;
	private String sAirlineEg;
}