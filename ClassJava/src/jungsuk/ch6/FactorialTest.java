package jungsuk.ch6;

public class FactorialTest {
	public static void main(String[] args) {
		int result = factorial(4);
		
		System.out.println(result);
	}
	
	static int factorial(int n) {
		int result = 0;
		
		if(n == 1) {
			result = 1;
		}
		else {
			System.out.println(n);
			result = n * factorial(n-1);
//			System.out.println(result);
		}
		return result;
	}
}
