package model;

public class RecursiveFunctions {
	
	public static int factorial(int n, int[] a) {
		return factorial(n, a);
	}
	
	public static int fact(int n, int[] a) {
		if (n == 0) {
			return a[0] = 1;
		} else {
			
		}
	}
	
	public static int Fibonacci(int n) {
		return Fibonacci(n);
	}
	
	public static int arraySummatory(int[] a, int n) {
		return arraySummatory(a, n);
	}
	
	public static int arraySum(int[] a, int n) {
		if (n == 0) {
			return a[0];
		} else {
			return a[n]+arraySummatory(a, n-1);
		}
	}
	
	public static void main() {
		
	}

}
