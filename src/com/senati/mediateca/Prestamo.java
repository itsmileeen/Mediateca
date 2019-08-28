package com.senati.mediateca;

public class Prestamo {
	int id;
	int idsocio;
	int idsoporte;
	int cantidad;
	int monto;
	
	//Constructor lleno
	public Prestamo(int id, int idsocio, int idsoporte, int cantidad, int monto) {
		super();
		this.id = id;
		this.idsocio = idsocio;
		this.idsoporte = idsoporte;
		this.cantidad = cantidad;
		this.monto = monto;
	}
	
	//Constructor vacio
	public Prestamo() {
		super();
	}
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdsocio() {
		return idsocio;
	}
	public void setIdsocio(int idsocio) {
		this.idsocio = idsocio;
	}
	public int getIdsoporte() {
		return idsoporte;
	}
	public void setIdsoporte(int idsoporte) {
		this.idsoporte = idsoporte;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	
	//To String
	@Override
	public String toString() {
		return "Prestamo [id=" + id + ", idsocio=" + idsocio + ", idsoporte=" + idsoporte + ", cantidad=" + cantidad
				+ ", monto=" + monto + "]";
	}
	
}
