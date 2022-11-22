package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Persona;
import com.example.demo.service.PersonaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
@CrossOrigin
@RestController
@RequestMapping("/persona")
public class PersonaController {

	@Autowired
	PersonaService personaService;
	
	//@GetMapping(value = "/all")
	
	/*
	@GetMapping
	public List<Persona>getPersona(){
		return personaService.getAllPersonas();
	}
	*/
	@GetMapping
	public List<Persona> listar() {
	   return personaService.listar();
	}
	
	//@PostMapping(value = "/save")
	@PostMapping
	public Persona add(@RequestBody Persona p ){
		   return personaService.add(p);
    }
	@GetMapping(path ={"/{id}"})
	public Persona listarId(@PathVariable("id")String id) {
	   return personaService.listarId(id);
	}
	
	//@PutMapping()
	@PutMapping("/{id}")
	public Persona edit(@RequestBody Persona p, @PathVariable("id")String id){
	  p.setId(id);
		return personaService.edit(p);
	}
	@DeleteMapping
	public ResponseEntity<?> delete(@PathVariable("id")String id){
		personaService.delete(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT.value()).build();
		}

}
