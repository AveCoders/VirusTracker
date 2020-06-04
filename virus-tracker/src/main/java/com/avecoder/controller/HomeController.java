package com.avecoder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.avecoder.services.VirusDataService;

@Controller 
public class HomeController {

	@Autowired
	VirusDataService virusDataService;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("locationStatistics", virusDataService.getAllStats());
		return "home";
	}
}
