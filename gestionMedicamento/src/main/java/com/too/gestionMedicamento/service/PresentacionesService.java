package com.too.gestionMedicamento.service;

import java.util.List;

import com.too.gestionMedicamento.entity.Presentacion;

public interface PresentacionesService {

	public abstract List<Presentacion> listAllPresentaciones();
	public abstract Presentacion addPresentacion(Presentacion presentacion);
	public abstract int removePresentacion(int id);
	public abstract Presentacion updatePresentacion(Presentacion presentacion); 
}
