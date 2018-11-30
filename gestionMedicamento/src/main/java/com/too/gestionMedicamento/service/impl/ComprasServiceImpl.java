package com.too.gestionMedicamento.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.too.gestionMedicamento.entity.Compra;
import com.too.gestionMedicamento.repository.ComprasJpaRepository;
import com.too.gestionMedicamento.service.ComprasService;

@Service("comprasServiceImpl")
public class ComprasServiceImpl implements ComprasService {

	@Autowired
	@Qualifier("comprasJpaRepository")
	private ComprasJpaRepository comprasJpaRepository;
	
	@Override
	public List<Compra> listAllCompras() {
		return comprasJpaRepository.findAll();
	}

	@Override
	public Compra addCompra(Compra compra) {
		return comprasJpaRepository.save(compra);
	}

	@Override
	public int removeCompra(String codigoCompra) {
		comprasJpaRepository.deleteById(codigoCompra);
		return 0;
	}

	@Override
	public Compra updateCompra(Compra compra) {
		return comprasJpaRepository.save(compra);
	}


}
