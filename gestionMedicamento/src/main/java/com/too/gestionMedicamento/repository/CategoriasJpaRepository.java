package com.too.gestionMedicamento.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.too.gestionMedicamento.entity.Categoria;

@Repository("categoriasJpaRepository")
public interface CategoriasJpaRepository extends JpaRepository<Categoria, Serializable>{

}
