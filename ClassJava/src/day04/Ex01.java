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
		
		System.out.println("ù���� ���ڸ� �Է��ϼ���.");
		num1 = scan.nextInt();
		
		System.out.println("�ι��� ���ڸ� �Է��ϼ���.");
		num2 = scan.nextInt();
		
		System.out.println("��Ģ���� ��ȣ�� �Է��ϼ���.");
		sign = scan.next();
		
		switch(sign) {
		case "+":
			result = num1 + num2;
			str = "���� ���� ";
			break;
		case "-":
			result = num1 - num2;
			str = "�� ���� ";
			break;
		case "*":
			result = num1 * num2;
			str = "���� ���� ";
			break;
		case "/":
			result = num1 / num2;
			str = "���� ���� ";
			break;
		default:
			result = -999;
		}
		
		System.out.println("�� ���� " + str + " " + result + " �Դϴ�.");
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
