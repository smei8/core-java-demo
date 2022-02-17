
//static imports, import only the staic member of the class
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@BeforeAll
	//this method will be execute first before the other once.
	public static void first() {
		System.out.println("Before all method is called");
	}
	@AfterAll
	public static void last() {
		System.out.println("After all method is called");
	}
	@BeforeEach
	public void eachBefore() {
		System.out.println("Before each is called.");
	}
	@AfterEach
	public void afterEach() {
		System.out.println("After each is called.");
	}
	@Test
	public void testAddPostivie() {
		Calculator calc = new Calculator();
		int actualOutput = calc.add(5, 7);
		
		int expectedOutput = 12;
		
		//assertion 
		assertEquals(expectedOutput, actualOutput);
		
		//use this if you dont want to do static import
		//Assertions.assertArrayEquals();
	}
	@Test
	public void testAddZero() {
		Calculator calc = new Calculator();
		int actualOutput = calc.add(0, 0);
		int expectedOutput = 0;
		assertEquals(expectedOutput, actualOutput);
	}
	@Test
	public void testAddNegitive() {
		Calculator calc = new Calculator();
		int actualOuput = calc.add(-4, -8);
		int expectedOutput = -12;
		assertEquals(expectedOutput, actualOuput);
	}
	@Test
	public void testMultiplyPostive() {
		Calculator calc = new Calculator();
		int actualOutput = calc.multiply(3, 5);
		int expectedOutput = 15;
		assertEquals(expectedOutput, actualOutput);
	}
	@Test
	public void testMultiplyZero() {
		Calculator calc = new Calculator();
		int actualOutput = calc.multiply(0, 5);
		int expectedOutput = 0;
		assertEquals(expectedOutput, actualOutput);
	}
}
