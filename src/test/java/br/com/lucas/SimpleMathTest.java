package br.com.lucas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleMathTest {

	//class a ser testada
	SimpleMath math = new SimpleMath();

	@Test
	void testSum() {
		
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		//metodo a ser testado da class
		Double actual = math.sum(firstNumber, secondNumber); //8.2D
		
		//valor esperado de actual
		Double expected = 8.2D;
		
		//resultado esperado para actual
		//passamos uma mensagem caso ocorra uma erro no teste
		String message = firstNumber + " + " + secondNumber + " did not produced the expected result";
		
		assertEquals(expected, actual, () -> message);
		assertNotEquals(9.2D, actual); //resultado esperado não pode ser o informado (9.2D)
		assertNotNull(actual); //resultado esperado não pode ser null
	}
	
	@Test
	void testSubtraction() {
		double firstNumber = 5.5D;
		double secondNumber = 3.7D;
		Double actual = math.subtraction(firstNumber,secondNumber);
		
		Double expected = 1.8D;
		double delta = 1e-9; // correção de tolerância
		String message = firstNumber + " - " + secondNumber + " did not produced the expected result";
		assertEquals(expected,actual, delta, () -> message);
	}

}
