package ja784a.ukb.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ja784a.ukb.domain.flights.model.Timetable;
import ja784a.ukb.domain.flights.service.TimetableService;

@Controller
public class TimeTableController {
	@Autowired
	private TimetableService timetableService;
	
	@GetMapping("/ukb-timetable-jp")
	public String getIimeTableJp(Model model) {
		List<Timetable> timetable = timetableService.getTimetableByTime();
		model.addAttribute("timetable", timetable);
		
		Date date = new Date();
		model.addAttribute("date", date);
		
		return "ukb-timetable-jp";
	}
	
	@GetMapping("/ukb-timetable-eg")
	public String getIimeTableEg(Model model) {
		List<Timetable> timetable = timetableService.getTimetableByTime();
		model.addAttribute("timetable", timetable);
		
		Date date = new Date();
		model.addAttribute("date", date);
		return "ukb-timetable-eg";
	}
}