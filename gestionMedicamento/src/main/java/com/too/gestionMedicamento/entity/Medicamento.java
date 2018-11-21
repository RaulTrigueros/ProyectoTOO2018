package com.too.gestionMedicamento.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="medicamento")
public class Medicamento {
	private String codigo;
	private String nombre;
	private double precio;
	private String unidadMedida;
	private Date fechaVencimiento;
	private Lote lote;
	
	public Medicamento(String codigo, String nombre, double precio, String unidadMedida, Date fechaVencimiento,
			Lote lote) {
		setCodigo(codigo);
		setNombre(nombre);
		setPrecio(precio);
		setUnidadMedida(unidadMedida);
		setFechaVencimiento(fechaVencimiento);
		setLote(lote);
		
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public Lote getLote() {
		return lote;
	}
	public void setLote(Lote lote) {
		this.lote = lote;
	}
	
	
}
