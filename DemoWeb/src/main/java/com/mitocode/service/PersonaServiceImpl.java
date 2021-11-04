package com.mitocode.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mitocode.model.Persona;
import com.mitocode.repository.IPersonaRepo;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	@Qualifier("person1")
	private IPersonaRepo repo;
	
	@Override
	public void registrar(String nombre) {
			repo.registrar(nombre);
	}

	@SuppressWarnings("resource")
	@Override
	public String findAll(String user) {
		String out = "";
		try {
			out = new Scanner(new URL("https://api.github.com/" + user).openStream(), "UTF-8").useDelimiter("\\A").next();			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return out;
	}

	@Override
	public String save(Persona per) {
		return "Saved correctly " + per.getName();
	}

	@Override
	public String update(Persona per) {
		return "Updated! Name: " + per.getName() + "Phone: " + per.getPhone();		
	}

	@Override
	public String delete(Integer id) {
		return "Deleted! " + id.toString();
	}
}