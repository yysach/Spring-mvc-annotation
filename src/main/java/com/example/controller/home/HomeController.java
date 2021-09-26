package com.example.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/spring-mvc")
public class HomeController {
	
	@GetMapping("/home")
	public String getHello() {
		return "home";
	}

}
