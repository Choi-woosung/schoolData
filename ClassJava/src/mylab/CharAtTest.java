package mylab;

import java.util.*;

public class CharAtTest {
	public CharAtTest() {
//		char ch = ' ';
//		String num1 = "12+34";
//		
//		int num2 = Integer.parseInt(num1.substring(0 ,num1.indexOf("+")));
//		int num3 = Integer.parseInt(num1.substring(num1.indexOf("+")+1));
//		System.out.println(num2+num3);
				
		int num1 = 0;
		int num2 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		String str = scan.next();
		
		if(str.indexOf("+") != -1) {
			num1 = Integer.parseInt(str.substring(0, str.indexOf("+")));
			num2 = Integer.parseInt(str.substring(str.indexOf("+")+1));
			System.out.println("������� " + (num1 + num2) + " �Դϴ�.");
		} else if(str.indexOf("-") != -1) {
			num1 = Integer.parseInt(str.substring(0, str.indexOf("-")));
			num2 = Integer.parseInt(str.substring(str.indexOf("-")+1));
			System.out.println("������� " + (num1 - num2) + " �Դϴ�.");
		}
		
//		if(str.substring(str.indexOf("+"), str.length() + 1) == "+") {
//			num1 = Integer.parseInt(str.substring(0, str.indexOf("+")));
//			num2 = Integer.parseInt(str.substring(str.indexOf("+"), str.length() - 1));
//			System.out.println(num1 + num2);
//		}
//		else if(minus == "-") {
//			num1 = Integer.parseInt(str.substring(0, str.indexOf("-")));
//			num2 = Integer.parseInt(str.substring(str.indexOf("-"), str.length() - 1));
//			System.out.println(num1 - num2);
//		}
//		else if(multiple == "*") {
//			num1 = Integer.parseInt(str.substring(0, str.indexOf("*")));
//			num2 = Integer.parseInt(str.substring(str.indexOf("*"), str.length() - 1));
//			System.out.println(num1 * num2);
//		}
//		else if(divide == "/") {
//			num1 = Integer.parseInt(str.substring(0, str.indexOf("/")));
//			num2 = Integer.parseInt(str.substring(str.indexOf("/"), str.length() - 1));
//			System.out.println(num1 / num2);
//		}
	}
	
	public static void main(String[] args) {
		new CharAtTest();
	}
}
