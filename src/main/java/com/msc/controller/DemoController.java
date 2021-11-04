package com.msc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.msc.model.Persona;
import com.msc.repo.IPersonaRepo;

@Controller
public class DemoController {
	
	/*El patrón de diseño Singleton (instancia única) está diseñado para restringir la creación de objetos 
	 * pertenecientes a una clase o el valor de un tipo a un único objeto. Su intención consiste en garantizar 
	 * que una clase sólo tenga una instancia y proporcionar un punto de acceso global a ella.
	 */
	@Autowired	
	private IPersonaRepo repo;
	
	@GetMapping("/greeting")
	//name = is a parameter that can be added in the request
	//required = Means the parameter name is not required
	//defaultValue = If the parameter name is not present, the method will set the default value "World"
	//Model = Is a spring feature, where we can add the variables that we want to show in a view.
	public String greeting(@RequestParam(name="name", required=false, defaultValue = "World") String name, Model model)
	{
		Persona p = new Persona();
		p.setIdPersona(1);
		p.setNombre("Maricarmen");
		repo.save(p);
		
		//When we add the attrb it can be used in the view
		model.addAttribute("name", name);
		return "greeting"; //greeting is the 
	}
}