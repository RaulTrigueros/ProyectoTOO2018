package com.too.gestionMedicamento.controller;

import org.apache.commons.logging.LogFactory;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.too.gestionMedicamento.entity.Venta;
import com.too.gestionMedicamento.service.VentaService;

@Controller
@RequestMapping("/ventas")
public class RealizarVentaController {
	
	private static final  String VENTAS_VISTAS="ventas";
	private static final Log LOG=LogFactory.getLog(RealizarVentaController.class);
		
	@Autowired
	@Qualifier("ventaServiceImpl")
	private VentaService ventaService;
			
	@GetMapping("/listaventas")
	public ModelAndView listAllVentas() {
		LOG.info("Call:"+"listAllVentas");
		ModelAndView mav= new ModelAndView(VENTAS_VISTAS);
		mav.addObject("ventas",new Venta());
		mav.addObject("ventas",ventaService.ListadoVentas());
		return mav;
	}
	
	@PostMapping("agregarventa")
	public String agregarVenta(@ModelAttribute("venta") Venta venta) {
		LOG.info("Call:"+"agregarVenta"+ "-- Parametro"+venta.toString());
		ventaService.agregarVenta(venta);
		return "redirect:/ventas/listaventas";
	}
	
	
}
