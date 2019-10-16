package day04;

import java.util.*;

public class Ex01 {
	public Ex01() {
		int num1;
		int num2;
		String sign;
		int result;
		String str ="";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번재 숫자를 입력하세요.");
		num1 = scan.nextInt();
		
		System.out.println("두번재 숫자를 입력하세요.");
		num2 = scan.nextInt();
		
		System.out.println("사칙연산 기호를 입력하세요.");
		sign = scan.next();
		
		switch(sign) {
		case "+":
			result = num1 + num2;
			str = "더한 값은 ";
			break;
		case "-":
			result = num1 - num2;
			str = "뺀 값은 ";
			break;
		case "*":
			result = num1 * num2;
			str = "곱한 값은 ";
			break;
		case "/":
			result = num1 / num2;
			str = "나눈 값은 ";
			break;
		default:
			result = -999;
		}
		
		System.out.println("두 수를 " + str + " " + result + " 입니다.");
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
