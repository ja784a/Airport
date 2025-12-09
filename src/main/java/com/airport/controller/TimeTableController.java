package com.airport.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.airport.domain.flights.model.Announce;
import com.airport.domain.flights.model.Timetable;
import com.airport.domain.flights.service.TimetableService;

@Controller
public class TimeTableController {
	@Autowired
	private TimetableService timetableService;
	
	@GetMapping("/")
	public String getIimeTableJp(Model model) {
		List<Timetable> timetable = timetableService.getTimetableByTime();
		model.addAttribute("timetable", timetable);
		
		List<Announce> texts = timetableService.getAnnounceBfo5Min();
		for (Announce t : texts) {
	 		model.addAttribute("text", t.getText());
	 		model.addAttribute("textEg", t.getTextEg());
		}
		
		Date date = new Date();
		model.addAttribute("date", date);
		
		return "ukb-timetable-jp";
	}
	
	@GetMapping("/ukb-timetable-eg")
	public String getIimeTableEg(Model model) {
		List<Timetable> timetable = timetableService.getTimetableByTime();
		model.addAttribute("timetable", timetable);
		
		List<Announce> texts = timetableService.getAnnounceBfo5Min();
		for (Announce t : texts) {
	 		model.addAttribute("text", t.getText());
	 		model.addAttribute("textEg", t.getTextEg());
		}
 		
		Date date = new Date();
		model.addAttribute("date", date);
		return "ukb-timetable-eg";
	}
	
}