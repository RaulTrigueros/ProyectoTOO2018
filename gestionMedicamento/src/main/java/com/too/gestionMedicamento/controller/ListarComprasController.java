package com.too.gestionMedicamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.too.gestionMedicamento.service.ComprasService;

@Controller
@RequestMapping("/compra")
public class ListarComprasController {
	private static final String Vista3="compras";
	
	@Autowired
	@Qualifier("comprasServiceImpl")
	private ComprasService comprasService;
	
	@GetMapping("/compras")
	public ModelAndView MostrarCompras() {
	
		ModelAndView mav =new ModelAndView(Vista3);
		mav.addObject("compras",comprasService.listAllCompras());
		return mav;
	}
}
