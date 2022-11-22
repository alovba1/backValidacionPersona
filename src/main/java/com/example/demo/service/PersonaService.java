package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.PersonaRepository;
import com.example.demo.model.Persona;

@Service
public class PersonaService implements IpersonaService {

	
	@Autowired
	PersonaRepository personaRepository;
	
	/*
	public List<Persona>getAllPersonas(){
		return personaRepository.findAll();
	}
	*/

	@Override
	public List<Persona> listar() {
		return (List<Persona>) personaRepository.findAll();
	}
	
	@Override
	public Persona add(Persona p) {
		return personaRepository.save(p);
	}


	@Override
	public Persona listarId(String id) {
		return personaRepository.findById(id).orElse(null);
	}


	@Override
	public Persona edit(Persona p) {
		return personaRepository.save(p);
	}


	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		personaRepository.deleteById(id);
	
	}


}
