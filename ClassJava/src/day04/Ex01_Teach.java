package day04;

import java.util.*;

public class Ex01_Teach {
	public Ex01_Teach() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("계산식을 입력하세요! : ");
		String sik = scan.next();
		
		char ch = ' ';
		String sNum1 = "";
		String sNum2 = "";
		int result;
		
		for(int i = 0; i < sik.length(); i++) {
			if((int)sik.charAt(i) <= 47 || (int)sik.charAt(i) >= 42) {
				ch = sik.charAt(i);
			}
				
			for(int l = 0; l < i - 1; l++) {
				sNum1 += sik.charAt(l);
			}
			
			for(int m = i + 2; m < sik.length(); m++) {
				sNum2 += sik.charAt(m);
			}
		}
		System.out.println(sNum1);
		System.out.println(sNum2);
		System.out.println(ch);
		int num1 = Integer.parseInt(sNum1);
		int num2 = Integer.parseInt(sNum2);
		
		
//		switch(ch) {
//		case '+':
//			result = num1 + num2;
//			System.out.println(result);
//			break;
//		case '-':
//			result = num1 - num2;
//			System.out.println(result);
//			break;
//		case '*':
//			result = num1 * num2;
//			System.out.println(result);
//			break;
//		case '/':
//			result = num1 / num2;
//			System.out.println(result);
//			break;
//		default:
//			System.out.println("잘못된 수식입니다.");
//		}
	}
	
	public static void main(String[] args) {
		new Ex01_Teach();
	}
}
