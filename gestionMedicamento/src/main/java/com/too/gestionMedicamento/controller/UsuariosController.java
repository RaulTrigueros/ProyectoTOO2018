package com.too.gestionMedicamento.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.too.gestionMedicamento.entity.Usuario;
import com.too.gestionMedicamento.service.UsuariosService;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {

	private static final String Vista="usuarios";
	
	@Autowired
	@Qualifier("usuariosServiceImpl")
	private UsuariosService usuarioService;
	
	@GetMapping("/listusuarios")
	public ModelAndView listAllUsuarios() {
		
		ModelAndView mav =new ModelAndView(Vista);
		mav.addObject("usuario", new Usuario());
		mav.addObject("usuarios",usuarioService.listAllUsuarios());
		return mav;
	}
	

	@PostMapping("/removeusuario")
	public String removeUsuario(@ModelAttribute("usuario") Usuario usuario) {
		
		try {
			usuarioService.removeUsuario(usuario.getIdu());
		}catch(EmptyResultDataAccessException e) {
		}
		
		return "redirect:/usuarios/listusuarios";
	}
	
	@PostMapping("/addusuario")
	public String addUsuario(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult bindingResult) {
		
			usuarioService.addUsuario(usuario);
		return "redirect:/usuarios/listusuarios";
	}
}
