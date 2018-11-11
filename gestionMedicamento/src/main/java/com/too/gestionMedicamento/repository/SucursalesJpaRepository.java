package com.too.gestionMedicamento.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.too.gestionMedicamento.entity.Sucursales;

@Repository("sucursalesJpaRepository")
public interface SucursalesJpaRepository extends JpaRepository<Sucursales, Serializable>{
	

}
