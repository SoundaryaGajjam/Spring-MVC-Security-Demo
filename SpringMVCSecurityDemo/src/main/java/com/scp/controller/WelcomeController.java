package com.scp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	
	@RequestMapping(value="/h")
	public String welcome(Model mod){
		mod.addAttribute("name","to the java world !!!!");
		return "welcome";
	}
	
	@RequestMapping(value="/admin")
	public String admin(Model mod){
		mod.addAttribute("name","admin");
		return "admin";
	}
}
