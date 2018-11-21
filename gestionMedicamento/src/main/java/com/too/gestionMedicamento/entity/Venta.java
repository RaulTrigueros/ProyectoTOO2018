package com.too.gestionMedicamento.entity;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="venta")

public class Venta {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="fechaventa")
	private Date fechaVenta;
	
	private ArrayList<Medicamento> medicamentos=new ArrayList<>();
	
	
	public Venta() {
		
	}

	public Venta(Date fechaVenta) {
		setFechaVenta(fechaVenta);
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	@Override
	public String toString() {
		String medicamentos=new String();
		for(Medicamento medicamento:this.medicamentos)
			medicamentos=medicamentos+medicamento.toString();
		return "fechs"+fechaVenta+ "Medicamentos"+medicamentos;
	}
	
}
