package com.mitocode.repository;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ch.qos.logback.classic.Logger;

@Repository
@Qualifier("person1")
public class PersonaRepoImpl1 implements IPersonaRepo{

	private static Logger LOG = (Logger) LoggerFactory.getLogger(PersonaRepoImpl1.class);
	
	@Override
	public void registrar(String nombre) {
		LOG.info("Registered: " + nombre);
	}
}