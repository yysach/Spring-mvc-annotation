package com.example.controller.manager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manager")
public class ManagerController {
	
	@GetMapping("/show_customer")
	public String viewCustomer() {
		return "show_customer";
	}

}
