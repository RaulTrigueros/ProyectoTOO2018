package com.too.gestionMedicamento.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="sucursales")
public class Sucursales {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	
	@Column(name="nombre")
	@NotNull
	private String nombre;
	@Column(name="direccion")
	@NotNull
	private String direccion;
	
	public Sucursales(){}
	
	public Sucursales(int id, String nombre, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
	}
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
