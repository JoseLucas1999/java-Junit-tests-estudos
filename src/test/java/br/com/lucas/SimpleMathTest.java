package br.com.lucas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleMathTest {

	@Test
	void testSum() {
		//class a ser testada
		SimpleMath math = new SimpleMath();
		
		//metodo a ser testado da class
		Double actual = math.sum(6.2D, 2D); //8.2D
		
		//valor esperado de actual
		Double expected = 8.2D;
		
		//resultado esperado para actual
		//passamos uma mensagem caso ocorra uma erro no teste
		assertEquals(expected, actual, "the testSum() did not produced the expected result");
		
		assertNotEquals(9.2D, actual); //resultado esperado não pode ser o informado (9.2D)
		assertNotNull(actual); //resultado esperado não pode ser null
				
		
	}

}
