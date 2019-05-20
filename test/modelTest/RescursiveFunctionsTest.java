package modelTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.RecursiveFunctions;

class RescursiveFunctionsTest {
	
	@Test
	public void setUpScenary() {
		
	}

	/*@Test
	void ArraySumTest() {
		setUpScenary();
		
		int[] a = new int[] {2, 5, 8, 10};
		int n = 2;
		
		RecursiveFunctions.arraySum(a, n);
	}*/
	
	@Test
	public void factorialTest() {
		setUpScenary();
		assertEquals(120, RecursiveFunctions.factorial(5));
	}
	
	@Test
	public void FibonacciTest() {
		setUpScenary();
		assertEquals(8, RecursiveFunctions.Fibonacci(6));
	}
	
	@Test
	public void sumTest() {
		setUpScenary();
		assertEquals(3, RecursiveFunctions.recursiveSum(2));
	}

}
