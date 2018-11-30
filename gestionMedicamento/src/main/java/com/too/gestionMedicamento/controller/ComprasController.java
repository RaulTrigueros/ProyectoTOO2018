package com.too.gestionMedicamento.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.too.gestionMedicamento.entity.Compra;
import com.too.gestionMedicamento.service.ComprasService;
import com.too.gestionMedicamento.service.MedicamentosService;
import com.too.gestionMedicamento.service.SucursalesService;

@Controller
@RequestMapping("/compras")
public class ComprasController {
	
	private static final String Vista2="compra";

	@Autowired
	@Qualifier("medicamentosServiceImpl")
	private MedicamentosService medicamentoService;
	
	@Autowired
	@Qualifier("comprasServiceImpl")
	private ComprasService comprasService;

	
	@Autowired
	@Qualifier("sucursalesServiceImpl")
	private SucursalesService sucursalesService;
	
	@GetMapping("/compra")
	public ModelAndView RegistraCompra() {

		ModelAndView mav =new ModelAndView(Vista2);
		mav.addObject("medicamentos", medicamentoService.listAllMedicamentos());
		mav.addObject("sucursales", sucursalesService.listAllSucursales());
		mav.addObject("compra", new Compra());
		return mav;
	}
	
	@PostMapping("/addcompra")
	public String addMedicamento(@Valid @ModelAttribute("compra") Compra compra, BindingResult bindingResult){
		
		
		comprasService.addCompra(compra);
		return "redirect:/compras/compra";
	}
}
