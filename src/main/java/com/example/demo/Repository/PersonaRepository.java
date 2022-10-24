package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Persona;

@Repository
public interface PersonaRepository extends MongoRepository<Persona,String>{

}
