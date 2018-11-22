package com.too.gestionMedicamento.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.too.gestionMedicamento.entity.Categoria;
import com.too.gestionMedicamento.repository.CategoriasJpaRepository;
import com.too.gestionMedicamento.service.CategoriasService;
@Service("categoriasServiceImpl")
public class CategoriasServiceImpl implements CategoriasService{

	@Autowired
	@Qualifier("categoriasJpaRepository")
	private CategoriasJpaRepository categoriasJpaRepository;
	
	@Override
	public List<Categoria> listAllCategorias() {
		return categoriasJpaRepository.findAll();
	}

	@Override
	public Categoria addCategoria(Categoria categoria) {
		return categoriasJpaRepository.save(categoria);
	}

	@Override
	public int removeCategoria(int id) {
		categoriasJpaRepository.deleteById(id);
		return 0;
	}

	@Override
	public Categoria updateCategoria(Categoria categoria) {
		return categoriasJpaRepository.save(categoria);
	}

}
