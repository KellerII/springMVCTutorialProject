package com.thoughtstreamllc.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String goHome(){
		//logical view name, represent one of the views
		return "home";
	}
}
