package com.senati.mediateca;

public class Socio {
	int id;
	String nombre;
	String apellido;
	String distrito;
	
	//Constructor lleno
	public Socio(int id, String nombre, String apellido, String distrito) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.distrito = distrito;
	}

	//Constructor vacio
	public Socio() {
		super();
	}
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	
	//To String
	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", distrito=" + distrito + "]";
	}
	
	
}
