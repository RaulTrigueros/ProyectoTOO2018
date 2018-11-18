package com.too.gestionMedicamento.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="presentacion")
public class Presentacion {
	
	@Id
	@GeneratedValue
	@Column(name="idPresentacion")
	private int idPresentacion;

	@Column(name="nombrePresentacion")
	@NotNull
	private String nombrePresentacion;
	
	public Presentacion() {}
	
	public Presentacion(int idPresentacion, String nombrePresentacion) {
		this.idPresentacion = idPresentacion;
		this.nombrePresentacion = nombrePresentacion;
	}

	public int getIdPresentacion() {
		return idPresentacion;
	}

	public void setIdPresentacion(int idPresentacion) {
		this.idPresentacion = idPresentacion;
	}

	public String getNombrePresentacion() {
		return nombrePresentacion;
	}

	public void setNombrePresentacion(String nombrePresentacion) {
		this.nombrePresentacion = nombrePresentacion;
	}

	

}
