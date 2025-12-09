package com.airport.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.airport.domain.flights.model.Airline;
import com.airport.domain.flights.service.AirlineService;
import com.airport.form.AirlineForm;

@Controller 
public class AirlineController {
	@Autowired
	private AirlineService airlineService;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/command-airlines")
	public String getCommandAirlines(Model model) {
		List<Airline> airlines = airlineService.getAirlines();
		
		model.addAttribute("airlines", airlines);
		
		return "command-airlines";
	}
	
	@GetMapping("add-airline")
	public String getAddAirline(@ModelAttribute AirlineForm airlineForm) {
		
		return "add-edit-airline";
	}
	
	@GetMapping("edit-airline/{id}")
	public String getEditAirline(@PathVariable("id") int id, @ModelAttribute AirlineForm airlineForm) {
		Airline airline = airlineService.getAirline(id);
		
		airlineForm.setId(airline.getId());
		airlineForm.setLogo(airline.getLogo());
		airlineForm.setAirlineName(airline.getAirlineName());
		airlineForm.setSAirlineJp(airline.getSAirlineJp());
		airlineForm.setSAirlineEg(airline.getSAirlineEg());
		airlineForm.setTwoLetter(airline.getTwoLetter());
		
		return "add-edit-airline";
	}
	
	@PostMapping("add-edit-airline")
	public String postAddEditAirline(AirlineForm airlineForm) {
		Airline airline = modelMapper.map(airlineForm, Airline.class);
		if (airlineForm.getId() == 0) {
			airlineService.addAirline(airline);
		} else {
			airlineService.updateAirline(airline);
		}
		
		return "redirect:/command-airlines";
	}
	
	@GetMapping("/delete-airline/{id}")
	public String getDeleteAirline(@PathVariable int id, Model model) {
		airlineService.deleteAirline(id);
		
		return getCommandAirlines(model);
	}
}