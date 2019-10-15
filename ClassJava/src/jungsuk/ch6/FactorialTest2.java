package jungsuk.ch6;

public class FactorialTest2 {
	static double factorial (int n) {
		if(n <= 0 || n > 20) {
			return -1;
		}
		if(n <= 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
	
	public static void main(String[] args) {
		int n = 21;
		double result = 0l;
		
		for(int i = 1; i <= n; i++) {
			
		}
	}
}
