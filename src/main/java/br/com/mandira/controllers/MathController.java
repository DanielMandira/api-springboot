package br.com.mandira.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
	
	@GetMapping
	public String teste() {
		return "endpoint carregado com sucesso!";
	}
	
	@GetMapping("/segundo")
	public String teste2() {
		return "Segundo endpoint";
	}
}
