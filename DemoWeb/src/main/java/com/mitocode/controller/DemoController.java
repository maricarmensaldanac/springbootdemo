package com.mitocode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mitocode.service.PersonaServiceImpl;


public class DemoController {

	@Autowired
	PersonaServiceImpl personaImpl;
	
	@GetMapping("/greeting")	
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
	/*
	@GetMapping("/users")	
	public String users(@RequestParam(name="name", required=false, defaultValue="users") String name, Model model) {
		model.addAttribute("name", name);
		personaImpl.findAll(name);
		return "users";
	}	*/
}