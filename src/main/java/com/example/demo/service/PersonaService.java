package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.PersonaRepository;
import com.example.demo.model.Persona;

@Service
public class PersonaService {

	
	@Autowired
	PersonaRepository personaRepository;
	
	public List<Persona>getAllPersonas(){
		return personaRepository.findAll();
	}
	

	public Persona add(Persona p) {
		return personaRepository.save(p);
	}

}
