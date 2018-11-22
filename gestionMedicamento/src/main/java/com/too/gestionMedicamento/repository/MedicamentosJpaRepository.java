package com.too.gestionMedicamento.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.too.gestionMedicamento.entity.Medicamento;

@Repository("medicamentosJpaRepository")
public interface MedicamentosJpaRepository extends JpaRepository<Medicamento, Serializable> {

}
