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

import ja784a.ukb.domain.flights.model.Area;
import ja784a.ukb.domain.flights.model.Dest;
import ja784a.ukb.domain.flights.service.AreaService;
import ja784a.ukb.domain.flights.service.DestService;
import ja784a.ukb.form.DestForm;

@Controller
public class DestController {
	@Autowired
	private DestService destService;
	
	@Autowired
	private AreaService areaService;
	
	@Autowired
	private ModelMapper mapper;
	
	@GetMapping("/command-dests")
	public String getCommandDests(Model model) {
		List<Dest>  dests = destService.getDests();
		
		model.addAttribute("dests", dests);
		
		return "command-dests";
	}
	
	@GetMapping("/add-dest")
	public String getAddEditDest(@ModelAttribute DestForm destForm, Model model) {
		List<Area> areas = areaService.getAreas();
		
		model.addAttribute("areas", areas);
		
		return "add-edit-dest";
	}
	
	@GetMapping("edit-dest/{id}")
	public String getEditEst(@PathVariable("id") int id, @ModelAttribute DestForm destForm, Model model) {
		Dest dest = destService.getDest(id);
		
		destForm.setId(dest.getId());
		destForm.setDestJp(dest.getDestJp());
		destForm.setDestEg(dest.getDestEg());
		destForm.setSDestJp(dest.getSDestJp());
		destForm.setSDestEg(dest.getSDestEg());
		destForm.setAreaId(dest.getAreaId());
		
		List<Area> areas = areaService.getAreas();
		
		model.addAttribute("areas", areas);
		model.addAttribute("destForm", destForm);
		
		return "add-edit-dest";
	}
	
	@PostMapping("add-edit-dest")
	public String postAddEditDest(DestForm destForm) {
		Dest dest = mapper.map(destForm, Dest.class);
		if (destForm.getId() == 0) {
			destService.addDest(dest);
		} else {
			destService.updateDest(dest);
		}
	return "redirect:/command-dests";
	}
}