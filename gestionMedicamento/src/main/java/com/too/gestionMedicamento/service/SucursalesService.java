package com.too.gestionMedicamento.service;

import java.util.List;

import com.too.gestionMedicamento.entity.Sucursales;

public interface SucursalesService {
	
	public abstract List<Sucursales> listAllSucursales();
	public abstract Sucursales addSucursal(Sucursales sucursal);
	public abstract int removeSucursal(int id);
	public abstract Sucursales updateSucursal(Sucursales sucursal); 
}
