package com.too.gestionMedicamento.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.too.gestionMedicamento.entity.Presentacion;
import com.too.gestionMedicamento.repository.PresentacionesJpaRepository;
import com.too.gestionMedicamento.service.PresentacionesService;

@Service("presentacionesServiceImpl")
public class PresentacionServiceImpl implements PresentacionesService{

	@Autowired
	@Qualifier("presentacionesJpaRepository")
	private PresentacionesJpaRepository presentacionesJpaRepository;
	
	@Override
	public List<Presentacion> listAllPresentaciones() {
		return presentacionesJpaRepository.findAll();
	}

	@Override
	public Presentacion addPresentacion(Presentacion presentacion) {
		return null;
	}

	@Override
	public int removePresentacion(int id) {
		return 0;
	}

	@Override
	public Presentacion updatePresentacion(Presentacion presentacion) {
		return null;
	}

}
