package model;

public class RecursiveFunctions {
	
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n*factorial(n-1);
		}
	
	}
	
	public static int Fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if(n==1){
			return 1;
		}else {
			return Fibonacci(n-1) + Fibonacci(n-2);
		}
	}
	
	public static int arraySummatory(int[] a) {
		return arraySum(a, a.length-1);
	}
	
	public static int arraySum(int[] a, int n) {
		if (n == 0) {
			return a[0];
		} else {
			return a[n]+arraySum(a, a.length-1);
		}
	}
	
	public static int recursiveSum(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n+recursiveSum(n-1);
		}
	}
}
