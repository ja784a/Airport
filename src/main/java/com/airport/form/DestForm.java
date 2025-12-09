package com.airport.form;

import lombok.Data;

@Data
public class DestForm {
	private int id;
	private String destJp;
	private String destEg;
	private String sDestJp;
	private String sDestEg;
	private int areaId;
}