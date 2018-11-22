package com.too.gestionMedicamento.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="medicamento")
public class Medicamento {

	@Id
	@Column(name="codigoMedicamento")
	private String codigoMedicamento;
	
	@Column(name="nombreMedicamento")
	@NotNull
	private String nombreMedicamento;
	
	@Column(name="precio")
	@NotNull
	private Double precio;
	
	
	@JoinColumn(name="idPresentacion")
	@NotNull
	@ManyToOne
	private Presentacion presentacion;
	
	
	@JoinColumn(name="idCategoria")
	@NotNull
	@ManyToOne
	private Categoria categoria;
	
	public Medicamento() {}

	public Medicamento(String codigoMedicamento, String nombreMedicamento, Double precio, Presentacion presentacion,
			Categoria categoria) {
		this.codigoMedicamento = codigoMedicamento;
		this.nombreMedicamento = nombreMedicamento;
		this.precio = precio;
		this.presentacion = presentacion;
		this.categoria = categoria;
	}

	public Presentacion getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(Presentacion presentacion) {
		this.presentacion = presentacion;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getCodigoMedicamento() {
		return codigoMedicamento;
	}

	public void setCodigoMedicamento(String codigoMedicamento) {
		this.codigoMedicamento = codigoMedicamento;
	}

	public String getNombreMedicamento() {
		return nombreMedicamento;
	}

	public void setNombreMedicamento(String nombreMedicamento) {
		this.nombreMedicamento = nombreMedicamento;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
}
