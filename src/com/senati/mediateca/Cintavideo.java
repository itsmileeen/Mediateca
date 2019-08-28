package com.senati.mediateca;

public class Cintavideo extends Soporte {
	String actores;
	int duracion;
	
	//Constructor lleno
	public Cintavideo(int id, String titulo, String autor, float precio, String actores, int duracion) {
		super(id, titulo, autor, precio);
		this.actores = actores;
		this.duracion = duracion;
	}
	
	//Constructor vacio
	public Cintavideo() {
		super();
	}
	
	//Getters and Setters
	public String getActores() {
		return actores;
	}
	public void setActores(String actores) {
		this.actores = actores;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	//To String
	@Override
	public String toString() {
		return "Cintavideo [actores=" + actores + ", duracion=" + duracion + ", id=" + id + ", titulo=" + titulo
				+ ", autor=" + autor + ", precio=" + precio + "]";
	}
	
	

}
