package com.mitocode.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Persona;
import com.mitocode.service.IPersonaService;

@RestController
@RequestMapping("/users")
public class RestDemoController {
	
	@Autowired
	private IPersonaService service;
	
	@GetMapping
	public String listas(String user){
		return service.findAll("users");
	}
	
	@PostMapping
	public String insert(@RequestBody Persona per) {
		return service.save(per);
	}
	
	@PutMapping
	public String update(@RequestBody Persona per) {
		return service.update(per);
	}
	
	@DeleteMapping(value = "/{id}")
	public String delete(@PathVariable ("id") Integer id) {
		return service.delete(id);
	}
}