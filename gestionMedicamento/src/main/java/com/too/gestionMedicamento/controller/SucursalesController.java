package com.too.gestionMedicamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.too.gestionMedicamento.entity.Sucursales;
import com.too.gestionMedicamento.service.SucursalesService;

@Controller
@RequestMapping("/sucursales")
public class SucursalesController {

	private static final String Vista="sucursales";
	
	@Autowired
	@Qualifier("sucursalesServiceImpl")
	private SucursalesService sucursalService;
	
	@GetMapping("/listsucursales")
	public ModelAndView listAllSucursales() {
		
		ModelAndView mav =new ModelAndView(Vista);
		mav.addObject("sucursal", new Sucursales());
		mav.addObject("sucursales", sucursalService.listAllSucursales());
		return mav;
	}
	
	@PostMapping("/addsucursal")
	public String addSucursal(@ModelAttribute("sucursal") Sucursales sucursal) {
		sucursalService.addSucursal(sucursal);
		return "redirect:/sucursales/listsucursales";
	}
	
	@PostMapping("/removesucursal")
	public String removeSucursal(@ModelAttribute("sucursal") Sucursales sucursal) {
		try {
			sucursalService.removeSucursal(sucursal.getId());
		}catch(EmptyResultDataAccessException e) {
			
		}
			
		
		return "redirect:/sucursales/listsucursales";
	}
}
