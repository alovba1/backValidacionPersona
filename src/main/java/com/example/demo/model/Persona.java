package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="persona")

public class Persona {
	@Id
	private String id;
	private String name;
	private String apellidos;
	private String documento;
	private String correo;
	private String genero;
	private String edad;
	private String pasatiempo;
	
	
	

	public Persona(String id, String name, String apellidos,String documento,String correo,String genero,String edad,String pasatiempo) {
		super();
		this.id = id;
		this.name = name;
		this.apellidos = apellidos;
		this.documento = documento;
		this.correo= correo;
		this.genero= genero;
		this.edad= edad;
		this.pasatiempo= pasatiempo;	}
	
	
	
	public String getPasatiempo() {
		return pasatiempo;
	}



	public void setPasatiempo(String pasatiempo) {
		this.pasatiempo = pasatiempo;
	}



	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	

}
