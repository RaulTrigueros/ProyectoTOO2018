package com.too.gestionMedicamento.service;

import java.util.List;

import com.too.gestionMedicamento.entity.Usuario;

public interface UsuariosService {

	public abstract List<Usuario> listAllUsuarios();
	public abstract Usuario addUsuario(Usuario usuario);
	public abstract int removeUsuario(int id);
	public abstract Usuario updateUsuario(Usuario usuario); 
}
