package com.example.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@GetMapping("/add_customer")
	public String addCustomer() {
		return "add_customer";
	}

}
