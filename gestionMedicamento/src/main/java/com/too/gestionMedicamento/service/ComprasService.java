package com.too.gestionMedicamento.service;

import java.util.List;

import com.too.gestionMedicamento.entity.Compra;

public interface ComprasService {

	public abstract List<Compra> listAllCompras();
	public abstract Compra addCompra(Compra compra);
	public abstract int removeCompra(String codigoCompra);
	public abstract Compra updateCompra(Compra compra);
}
