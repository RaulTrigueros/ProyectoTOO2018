package com.too.gestionMedicamento.service;

import java.util.List;

import com.too.gestionMedicamento.entity.Categoria;

public interface CategoriasService {

	public abstract List<Categoria> listAllCategorias();
	public abstract Categoria addCategoria(Categoria categoria);
	public abstract int removeCategoria(int id);
	public abstract Categoria updateCategoria(Categoria categoria); 
}
