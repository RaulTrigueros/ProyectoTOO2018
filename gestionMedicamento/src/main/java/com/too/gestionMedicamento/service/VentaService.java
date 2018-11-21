package com.too.gestionMedicamento.service;

import java.util.ArrayList;
import java.util.List;

import com.too.gestionMedicamento.entity.Venta;

public interface VentaService {

	public abstract List<Venta> ListadoVentas();
	public abstract Venta agregarVenta(Venta venta);
	public abstract int eliminarVenta(int id);
	public abstract Venta actualizarVenta(Venta venta);
}
