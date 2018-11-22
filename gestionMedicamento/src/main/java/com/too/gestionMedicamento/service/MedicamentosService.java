package com.too.gestionMedicamento.service;

import java.util.List;

import com.too.gestionMedicamento.entity.Medicamento;

public interface MedicamentosService {

	public abstract List<Medicamento> listAllMedicamentos();
	public abstract Medicamento addMedicamento(Medicamento medicamento);
	public abstract int removeMedicamento(String codigoMedicamento);
	public abstract Medicamento updateMedicamento(Medicamento medicamento); 
}
