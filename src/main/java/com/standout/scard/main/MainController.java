package com.standout.scard.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
public class MainController {

	 @Autowired
	 private MainService mainService ;
	 
	@GetMapping("/")
	public String home(Model model) throws Exception {
		Integer selectCountAll = mainService.selectCountAll();
		model.addAttribute("selectCountAll", selectCountAll);
		
		List<MainVO> selectPersonAll = mainService.selectPersonAll();
		model.addAttribute("persons", selectPersonAll);
		return "home";
	}

	@PostMapping("/create")
    public String insertPerson(@ModelAttribute MainVO person) {
		System.out.println(person);
		mainService.insertPerson(person);
        return "redirect:/";
    }
	
	@PostMapping("/update")
    public String updatePerson(@ModelAttribute MainVO person) {
		mainService.updatePerson(person);
        return "redirect:/";
    }
	
	@PostMapping("/delete")
    public String deletePerson(@ModelAttribute MainVO person) {
		System.out.println(person);
		mainService.deletePerson(person.getId());
        return "redirect:/";
    }
	
}
