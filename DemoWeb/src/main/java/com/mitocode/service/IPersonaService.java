package com.mitocode.service;

import com.mitocode.model.Persona;

public interface IPersonaService {
	public void registrar(String nombre);	
	String findAll(String user);
	String save(Persona per);
	String update(Persona per);
	String delete(Integer id);
}