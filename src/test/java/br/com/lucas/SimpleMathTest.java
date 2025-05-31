package br.com.lucas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Math Operatins in SimpleMath Class")
class SimpleMathTest {
	
	//test[System under test] - [condition or state change] - [expected result]

	//class a ser testada
	SimpleMath math = new SimpleMath();

	@Test
	@DisplayName("Test Sum 6.2 + 2 = 8.2")
	void testSum() {
		//Given - definição das variaveis
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		double expected = 8.2D;
		String message = "the sum "+firstNumber + " + " + secondNumber + " did not produced the expected result";
		
		//When - invocação do métod a ser testado
		Double actual = math.sum(firstNumber, secondNumber);
		
		//Then - valida retorno
		assertEquals(expected, actual, () -> message);
		assertNotEquals(9.2D, actual);
		assertNotNull(actual);
	}
	
	@Test
	@DisplayName("Test Subtraction 5.5 + 3.7 = 1.8")
	void testSubtraction() {
		//Given
		double firstNumber = 5.5D;
		double secondNumber = 3.7D;
		double expected = 1.8D;
		String message = "the subtraction "+firstNumber + " - " + secondNumber + " did not produced the expected result";
		Double delta = 1e-9; // correção de tolerância
		
		//When
		Double actual = math.subtraction(firstNumber,secondNumber);
		
		//Then
		assertEquals(expected,actual, delta, () -> message);
		assertNotNull(actual);
	}
	
	@Test
	@DisplayName("Test Multiplication 5 * 5 = 25")
	void testMultiplication() {
		//Given
		double firstNumber = 5.0D;
		double secondNumber = 5.0D;
		double expected = 25.0D;
		Double delta = 1e-9;
		String message = "the multiplication "+firstNumber + " * " + secondNumber + " did not produced the expected result";
		
		//When
		Double actual = math.multiplication(firstNumber, secondNumber);
	    
		assertEquals(expected, actual, delta, () -> message);
		assertNotNull(actual);
	}
	
	@Test
	@DisplayName("Test Division 10 / 2 = 5")
	void testDivision() {
		//Given
		double firstNumber = 10.0D;
		double secondNumber = 2.0D;
		double expected = 5.0D;
		Double delta = 1e-9;
		String message = "the division "+firstNumber + " / " + secondNumber + " did not produced the expected result";
		
		//When
		Double actual = math.division(firstNumber, secondNumber);
		
		assertEquals(expected, actual, delta, () -> message);
		assertNotNull(actual);
	}

	@Test
	@DisplayName("Test mean of (8 + 2)/2")
	void testMean() {
		//Given
		double firstNumber = 8D;
		double secondNumber = 2D;
		double expected = 5D;
		Double delta = 1e-9;
		String message = "the mean "+firstNumber + " and " + secondNumber + " did not produced the expected result";
		
		//When
		Double actual = math.mean(firstNumber, secondNumber);
		
		//When
		assertEquals(expected, actual, delta, () -> message);
		assertNotEquals(9.2D, actual);
		assertNotNull(actual);
		
	}
	
	@Test
	@DisplayName("Test Sqaure Root of 9")
	void testSquareRoot() {
		//Given
		double number = 9D;
		double expected = 3D;
		Double delta = 1e-9;
		String message = "the square root of "+number + " did not produced the expected result";
		
		//When
		Double actual = math.squareRoot(number);
		
		//When
		assertEquals(expected, actual, delta, () -> message);
		assertNotEquals(9.2D, actual);
		assertNotNull(actual);
	}
	
	@Test
	@DisplayName("Test division for zero")
	void testDivisionForZero() {
		fail();
	}
}



