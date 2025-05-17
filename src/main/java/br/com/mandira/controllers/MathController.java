package br.com.mandira.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.mandira.SimpleMath;

@RestController
public class MathController {
	SimpleMath math = new SimpleMath();
	
	@GetMapping("/sum")
	public String sum2() {
		return "Digite os numeros na URL da seguinte forma /sum/10/20";
	}
	
	@GetMapping("/sum/{num1}/{num2}")
	public Double sum(
			@PathVariable Double num1,
			@PathVariable Double num2
			) {
		
		return math.sum(num1, num2);
	}
	
	@GetMapping("/sub/{num1}/{num2}")
	public Double sub(
			@PathVariable Double num1,
			@PathVariable Double num2
			) {
		
		return math.subtraction(num1, num2);
	}
	
	@GetMapping("/div/{num1}/{num2}")
	public Double div(
			@PathVariable Double num1,
			@PathVariable Double num2
			) {
		
		return math.division(num1, num2);
	}
	
	@GetMapping("/mult/{num1}/{num2}")
	public Double mult(
			@PathVariable Double num1,
			@PathVariable Double num2
			) {
		
		return math.multiplication(num1, num2);
	}
	
	@GetMapping("/media/{num1}/{num2}")
	public Double media(
			@PathVariable Double num1,
			@PathVariable Double num2
			) {
		
		return math.mean(num1, num2);
	}
	
	@GetMapping("/raiz/{num1}")
	public Double raiz(
			@PathVariable Double num1
			) {
		
		return math.squareRoot(num1);
	}
	
	

}
