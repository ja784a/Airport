package ja784a.ukb.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ja784a.ukb.domain.flights.model.Airline;
import ja784a.ukb.domain.flights.model.Dest;
import ja784a.ukb.domain.flights.model.Remark;
import ja784a.ukb.domain.flights.model.Timetable;
import ja784a.ukb.domain.flights.service.AirlineService;
import ja784a.ukb.domain.flights.service.AreaService;
import ja784a.ukb.domain.flights.service.DestService;
import ja784a.ukb.domain.flights.service.RemarkService;
import ja784a.ukb.domain.flights.service.TimetableService;
import ja784a.ukb.form.FlightForm;

@Controller
public class FlightController {
	@Autowired
	private TimetableService timetableService;
	
	@Autowired
	private AirlineService airlineService;
	
	@Autowired
	private DestService destService;
	
	@Autowired
	private AreaService areaService;
	
	@Autowired
	private RemarkService remarkService;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/add-flight")
	public String getAddFlight(@ModelAttribute FlightForm flightForm, Model model) {
		List<Airline> airlines = airlineService.getAirlines();
		
		List<Dest> dests = destService.getDests();
		
		List<Remark> remarks = remarkService.getRemarks();
		
		model.addAttribute("airlines", airlines);
		model.addAttribute("remarks", remarks);
		model.addAttribute("dests", dests);
		
		return "add-edit";
	}
	
	@PostMapping("/add-edit")
	public String postAddAttribute(FlightForm flightForm) {
		Timetable timetable = modelMapper.map(flightForm, Timetable.class);
		
		if (flightForm.getId() == 0) {
			
			timetableService.addFlight(timetable);
			
			return "redirect:/command-flights";
		} else {
			timetableService.updateFlight(timetable);
			
			return "redirect:/command-flights";
		}
	}
	
	@GetMapping("/command-flights")
	public String getCommandFlights(Model model) {
		List<Timetable> timetable = timetableService.getAllFlights();
		
		model.addAttribute("timetable", timetable);
		
		return "command-flights";
	}
	
	@GetMapping("edit-flight/{id}")
	public String getEditFlight(@PathVariable("id") int id, @ModelAttribute FlightForm flightForm, Model model) {
		Timetable flight = timetableService.getFlight(id);
		
		flightForm.setId(flight.getId());
		flightForm.setAirlineId(flight.getAirlineId());
		flightForm.setDeptTime(flight.getDeptTime());
		flightForm.setNewDeptTime(flight.getNewDeptTime());
		flightForm.setFlight(flight.getFlight());
		flightForm.setDestId(flight.getDestId());
		
		flightForm.setGate(flight.getGate());
		flightForm.setRemarkId(flight.getRemarkId());
		
		List<Airline> airlines = airlineService.getAirlines();
		
		List<Dest> dests = destService.getDests();
		
		List<Remark> remarks = remarkService.getRemarks();
		
		model.addAttribute("airlines", airlines);
		model.addAttribute("dests", dests);
		model.addAttribute("remarks", remarks);
		return "add-edit";
	}
	
}