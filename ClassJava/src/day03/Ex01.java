package day03;

import java.util.*;

/*
 * ���� 1]
 * 	
 */

public class Ex01 {
	public Ex01() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��ȯ�� ���ĺ��� �Է��ϼ���.");
		char ch = scan.next().charAt(0);
		
		if((int)ch < 97) {
			System.out.println((char)(ch+32));
		}
		else {
			System.out.println((char)(ch-32));
		}
		scan.close();
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
