package com.too.gestionMedicamento.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="categoria")
public class Categoria {

	@Id
	@GeneratedValue
	@Column(name="idCategoria")
	private int idCategoria;
	
	@Column(name="nombreCategoria")
	@NotNull
	private String nombreCategoria;
	
	public Categoria() {}

	public Categoria(int idCategoria, String nombreCategoria) {
		this.idCategoria = idCategoria;
		this.nombreCategoria = nombreCategoria;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}
	
	
}
