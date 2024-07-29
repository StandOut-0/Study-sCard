package com.standout.scard.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;

@Controller
public class MainController {

	 @Autowired
	 private MainDao mainDao ;
	 
	@GetMapping("/")
	public String home(Model model) throws Exception {
		Integer selectCountAll = mainDao.selectCountAll();
		model.addAttribute("selectCountAll", selectCountAll);
		
		List<MainVO> selectPersonAll = mainDao.selectPersonAll();
		model.addAttribute("persons", selectPersonAll);
		System.out.println(selectPersonAll);
		return "home";
	}
	
}
