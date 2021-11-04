package com.mitocode.repository;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ch.qos.logback.classic.Logger;

@Repository
@Qualifier("person2")
public class PersonaRepoImpl2 implements IPersonaRepo{

	private static Logger LOG = (Logger) LoggerFactory.getLogger(PersonaRepoImpl2.class);
	
	@Override
	public void registrar(String nombre) {
		LOG.info("Registered: " + nombre);
	}
}