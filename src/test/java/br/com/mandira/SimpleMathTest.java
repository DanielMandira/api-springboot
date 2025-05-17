package br.com.mandira;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleMathTest {

	  SimpleMath math = new SimpleMath();

	    @Test
	    void testSoma() {
	        Double actual = math.sum(15.8D, 7.8D);
	        double expected = 23.6D;
	        assertEquals(expected, actual, "Teste de soma falhou.");
	    }

	    @Test
	    void testSubtracao() {
	        Double actual = math.subtraction(11.2D, 22.56D);
	        double expected = -11.36D;
	        assertEquals(expected, actual, "Teste de subtração falhou.");
	    }

	    @Test
	    void testMultiplicacao() {
	        Double actual = math.multiplication(4.0D, 2.5D);
	        double expected = 10.0D;
	        assertEquals(expected, actual, "Teste de multiplicação falhou.");
	    }

	    @Test
	    void testDivisao() {
	        Double actual = math.division(10.0D, 2.0D);
	        double expected = 5.0D;
	        assertEquals(expected, actual, "Teste de divisão falhou.");
	    }


	    @Test
	    void testMedia() {
	        Double actual = math.mean(10.0D, 20.0D);
	        double expected = 15.0D;
	        assertEquals(expected, actual, "Teste de média falhou.");
	    }

	    @Test
	    void testRaizQuadrada() {
	        Double actual = math.squareRoot(25.0D);
	        double expected = 5.0D;
	        assertEquals(expected, actual, "Teste de raiz quadrada falhou.");
	    }
}
