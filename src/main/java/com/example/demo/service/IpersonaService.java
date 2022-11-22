package com.example.demo.service;
import java.util.List;

import com.example.demo.model.Persona;
public interface IpersonaService {


public List <Persona>listar();
public Persona listarId(String id);
public Persona add(Persona p);
public Persona edit(Persona p);
void delete(String id);
}
