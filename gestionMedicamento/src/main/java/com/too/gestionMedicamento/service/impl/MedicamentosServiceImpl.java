package com.too.gestionMedicamento.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.too.gestionMedicamento.entity.Medicamento;
import com.too.gestionMedicamento.repository.MedicamentosJpaRepository;
import com.too.gestionMedicamento.service.MedicamentosService;

@Service("medicamentosServiceImpl")
public class MedicamentosServiceImpl implements MedicamentosService{

	@Autowired
	@Qualifier("medicamentosJpaRepository")
	private MedicamentosJpaRepository medicamentosJpaRepository;
	
	@Override
	public List<Medicamento> listAllMedicamentos() {
		return medicamentosJpaRepository.findAll();
	}

	@Override
	public Medicamento addMedicamento(Medicamento medicamento) {
		return medicamentosJpaRepository.save(medicamento);
	}

	@Override
	public int removeMedicamento(String codigoMedicamento) {
		medicamentosJpaRepository.deleteById(codigoMedicamento);
		return 0;
	}

	@Override
	public Medicamento updateMedicamento(Medicamento medicamento) {
		return medicamentosJpaRepository.save(medicamento);
	}

	
}
