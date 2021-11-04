package com.msc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msc.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
