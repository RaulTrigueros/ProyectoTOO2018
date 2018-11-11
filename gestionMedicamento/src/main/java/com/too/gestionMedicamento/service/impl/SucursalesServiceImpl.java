package com.too.gestionMedicamento.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.too.gestionMedicamento.entity.Sucursales;
import com.too.gestionMedicamento.repository.SucursalesJpaRepository;
import com.too.gestionMedicamento.service.SucursalesService;

@Service("sucursalesServiceImpl")
public class SucursalesServiceImpl implements SucursalesService{

	@Autowired
	@Qualifier("sucursalesJpaRepository")
	private SucursalesJpaRepository sucursalJpaRepository;
	@Override
	public List<Sucursales> listAllSucursales() {
		return sucursalJpaRepository.findAll();
	}

	@Override
	public Sucursales addSucursal(Sucursales sucursal) {
		
		return sucursalJpaRepository.save(sucursal);
	}

	@Override
	public int removeSucursal(int id) {
		sucursalJpaRepository.deleteById(id);
		return 0;
	}

	@Override
	public Sucursales updateSucursal(Sucursales sucursal) {
		return sucursalJpaRepository.save(sucursal);
	}
	

}
