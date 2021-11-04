package com.mitocode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mitocode.service.IPersonaService;

@SpringBootApplication
public class DemoWebApplication {

	@Autowired
	private IPersonaService service;
	
	public static void main(String[] args) {
		
		SpringApplication.run(DemoWebApplication.class, args);
		
	}

}
