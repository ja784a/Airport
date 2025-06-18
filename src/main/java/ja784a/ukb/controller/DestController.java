package ja784a.ukb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ja784a.ukb.domain.flights.model.Dest;
import ja784a.ukb.domain.flights.service.DestService;

@Controller
public class DestController {
	@Autowired
	private DestService destService;
	
	@GetMapping("/command-dests")
	public String getCommandDests(Model model) {
		List<Dest>  dests = destService.getDests();
		
		model.addAttribute("dests", dests);
		
		return "command-dests";
	}
}