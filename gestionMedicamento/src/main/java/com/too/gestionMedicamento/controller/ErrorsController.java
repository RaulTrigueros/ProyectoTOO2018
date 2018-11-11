package com.too.gestionMedicamento.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorsController {

	public static final String vista="error/500";
	@ExceptionHandler(Exception.class)
	public String MostrarError() {
		return vista;
	}
}
