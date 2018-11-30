package com.too.gestionMedicamento.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.too.gestionMedicamento.entity.Compra;

@Repository("comprasJpaRepository")
public interface ComprasJpaRepository extends JpaRepository<Compra, Serializable>{

}
