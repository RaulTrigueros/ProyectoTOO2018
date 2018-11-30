package com.too.gestionMedicamento.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="compra")
public class Compra {
	
	@Id
	@Column(name="codigoCompra")
	private String codigoCompra;
	
	@Column(name="fechaCompra")
	@NotNull
	private Date fechaCompra;
	
	@Column(name="lote")
	@NotNull
	private Double lote;
	
	@Column(name="cantidad")
	@NotNull
	private Double cantidad;
	
	@Column(name="subtotal")
	@NotNull
	private Double subtotal;
	
	@Column(name="iva")
	@NotNull
	private Double iva;
	
	@Column(name="total")
	@NotNull
	private Double total;
	
	@Column(name="precioUni")
	@NotNull
	private Double precioUni;
	
	@JoinColumn(name="codigoMedicamento")
	@NotNull
	@ManyToOne
	private Medicamento medicamento;
	
	@JoinColumn(name="id")
	@NotNull
	@ManyToOne
	private Sucursales sucursal;

	
	public Compra() {
	}


	public Compra(String codigoCompra, @NotNull Date fechaCompra, @NotNull Double lote, @NotNull Double cantidad,
			@NotNull Double subtotal, @NotNull Double iva, @NotNull Double total, @NotNull Double precioUni,
			@NotNull Medicamento medicamento, @NotNull Sucursales sucursal) {
		super();
		this.codigoCompra = codigoCompra;
		this.fechaCompra = fechaCompra;
		this.lote = lote;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.iva = iva;
		this.total = total;
		this.precioUni = precioUni;
		this.medicamento = medicamento;
		this.sucursal = sucursal;
	}

	public Double getPrecioUni() {
		return precioUni;
	}
	
	public void setPrecioUni(Double precioUni) {
		this.precioUni = precioUni;
	}

	public String getCodigoCompra() {
		return codigoCompra;
	}


	public void setCodigoCompra(String codigoCompra) {
		this.codigoCompra = codigoCompra;
	}


	public Date getFechaCompra() {
		return fechaCompra;
	}


	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}


	public Double getCantidad() {
		return cantidad;
	}


	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}


	public Double getSubtotal() {
		return subtotal;
	}


	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}


	public Double getIva() {
		return iva;
	}


	public void setIva(Double iva) {
		this.iva = iva;
	}


	public Double getTotal() {
		return total;
	}


	public void setTotal(Double total) {
		this.total = total;
	}


	public Medicamento getMedicamento() {
		return medicamento;
	}


	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}


	public Sucursales getSucursal() {
		return sucursal;
	}


	public void setSucursal(Sucursales sucursal) {
		this.sucursal = sucursal;
	}


	public Double getLote() {
		return lote;
	}


	public void setLote(Double lote) {
		this.lote = lote;
	}
	
	
}
