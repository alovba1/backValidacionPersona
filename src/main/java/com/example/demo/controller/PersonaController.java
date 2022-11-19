package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Persona;
import com.example.demo.service.PersonaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
@CrossOrigin
@RestController
@RequestMapping("/persona")
public class PersonaController {

	@Autowired
	PersonaService personaService;
	
	@GetMapping(value = "/all")
	//@GetMapping
	public List<Persona>getPersona(){
		return personaService.getAllPersonas();
	}
	@PostMapping(value = "/save")
	//@PostMapping
	public Persona add(@RequestBody Persona p ){
		   return personaService.add(p);
    }
}
