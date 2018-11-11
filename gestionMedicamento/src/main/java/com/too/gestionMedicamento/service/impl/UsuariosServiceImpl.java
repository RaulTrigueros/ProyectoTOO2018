package com.too.gestionMedicamento.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.too.gestionMedicamento.entity.Usuario;
import com.too.gestionMedicamento.repository.UsuariosJpaRepository;
import com.too.gestionMedicamento.service.UsuariosService;

@Service("usuariosServiceImpl")
public class UsuariosServiceImpl implements UsuariosService{
	

	@Autowired
	@Qualifier("usuariosJpaRepository")
	private UsuariosJpaRepository usuarioJpaRepository;
	@Override
	public List<Usuario> listAllUsuarios() {
		return usuarioJpaRepository.findAll();
	}

	@Override
	public Usuario addUsuario(Usuario usuario) {
		
		return usuarioJpaRepository.save(usuario);
	}

	@Override
	public int removeUsuario(int id) {
		usuarioJpaRepository.deleteById(id); ;
		return 0;
	}

	@Override
	public Usuario updateUsuario(Usuario usuario) {
		return usuarioJpaRepository.save(usuario);
	}

}
