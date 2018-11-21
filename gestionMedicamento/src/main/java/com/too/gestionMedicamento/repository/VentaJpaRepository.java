package com.too.gestionMedicamento.repository;

import java.io.Serializable;
import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.too.gestionMedicamento.entity.Medicamento;
import com.too.gestionMedicamento.entity.Venta;

@Repository("ventaJpaRepository")
public interface VentaJpaRepository extends JpaRepository<Venta,Serializable>{

	public abstract ArrayList<Venta> FindMedicamentoOrdeByfechaVenta(Medicamento medicamento);
}
