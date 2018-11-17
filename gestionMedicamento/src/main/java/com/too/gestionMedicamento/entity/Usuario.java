package com.too.gestionMedicamento.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue
	@Column(name="idu")
	private int idu;
	
	@Column(name="nombre")
	@NotNull
	private String nombre;
	
	@Column(name="clave")
	@NotNull
	private String clave;
	
	@Column(name="rol")
	@NotNull
	private String rol;
	
	public Usuario() {}
	
	public Usuario(int idu, @NotNull String nombre, @NotNull String clave, @NotNull String rol) {
		super();
		this.idu = idu;
		this.nombre = nombre;
		this.clave = clave;
		this.rol = rol;
	}

	public int getIdu() {
		return idu;
	}

	public void setIdu(int idu) {
		this.idu = idu;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	
}
