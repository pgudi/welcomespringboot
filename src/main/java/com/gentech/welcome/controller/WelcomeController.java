package com.gentech.welcome.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/","/welcome","/home"})
public class WelcomeController {

	@GetMapping()
	public String getStatus()
	{
		return "Welcome to Spring boot Backend Application Deployment!!!!";
	}
}
