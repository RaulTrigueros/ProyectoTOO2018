package com.too.gestionMedicamento.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.too.gestionMedicamento.controller.RealizarVentaController;
import com.too.gestionMedicamento.entity.Venta;
import com.too.gestionMedicamento.repository.VentaJpaRepository;
import com.too.gestionMedicamento.service.VentaService;

@Service("ventaServiceImpl")
public class VentaServiceImpl implements VentaService{
	
	private static final Log LOG=(Log) LogFactory.getLog(VentaServiceImpl.class);
	
	@Autowired
	@Qualifier("ventaJpaRepository")
	private VentaJpaRepository ventaJpaRepository;
	
	@Override
	public List<Venta>ListadoVentas(){
		LOG.info("Call:"+"ListadoVentas");
		return ventaJpaRepository.findAll();
	}
	
	@Override
	public  Venta agregarVenta(Venta venta) {
		LOG.info("Call:"+"agregarVenta");
		return ventaJpaRepository.save(venta);
	}
	
	@Override
	public  int eliminarVenta(int id) {
		ventaJpaRepository.delete(id);
		return 0;
	}
	@Override
	public  Venta actualizarVenta(Venta venta) {
		return ventaJpaRepository.save(venta);
		
	}
}
