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

import com.too.gestionMedicamento.entity.Categoria;
import com.too.gestionMedicamento.entity.Medicamento;
import com.too.gestionMedicamento.entity.Presentacion;
import com.too.gestionMedicamento.service.CategoriasService;
import com.too.gestionMedicamento.service.MedicamentosService;
import com.too.gestionMedicamento.service.PresentacionesService;

@Controller
@RequestMapping("/medicamentos")
public class MedicamentosController {

private static final String Vista1="medicamento";
	
	@Autowired
	@Qualifier("medicamentosServiceImpl")
	private MedicamentosService medicamentoService;
	
	@Autowired
	@Qualifier("presentacionesServiceImpl")
	private PresentacionesService presentacionService;
	
	@Autowired
	@Qualifier("categoriasServiceImpl")
	private CategoriasService categoriaService;
	
	@GetMapping("/listmedicamentos")
	public ModelAndView listAllMedicamentos() {
		
		ModelAndView mav =new ModelAndView(Vista1);
		mav.addObject("medicamento", new Medicamento());
		mav.addObject("categoria", new Categoria());
		mav.addObject("presentacion", new Presentacion());
		mav.addObject("presentaciones",presentacionService.listAllPresentaciones());
		mav.addObject("categorias",categoriaService.listAllCategorias());
		mav.addObject("medicamentos",medicamentoService.listAllMedicamentos());
		return mav;
	}
	
	@PostMapping("/addmedicamento")
	public String addMedicamento(@Valid @ModelAttribute("medicamento") Medicamento medicamento, BindingResult bindingResult) {
		
		ModelAndView mav2 =new ModelAndView(Vista1);
		mav2.addObject("medicamento", new Medicamento());
		mav2.addObject("categoria", new Categoria());
		mav2.addObject("presentacion", new Presentacion());
		mav2.addObject("presentaciones",presentacionService.listAllPresentaciones());
		mav2.addObject("categorias",categoriaService.listAllCategorias());
		medicamentoService.addMedicamento(medicamento);
		return "redirect:/medicamentos/listmedicamentos";
	}
	
	@PostMapping("/removemedicamento")
	public String removeMedicamento(@ModelAttribute("medicamento") Medicamento medicamento) {
		try {
			medicamentoService.removeMedicamento(medicamento.getCodigoMedicamento());
		}catch(EmptyResultDataAccessException e) {
			
		}
			
		
		return "redirect:/medicamentos/listmedicamentos";
	}
}
