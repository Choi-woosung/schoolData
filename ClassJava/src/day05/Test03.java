package day05;

import java.util.Scanner;

/*
 * 1. ���ڿ��� �Է��ϸ� ���ڿ� �տ� "###"�� �ٿ��� ��ȯ���ִ� �Լ��� �ۼ��ϰ�
 * 2. �� �Լ��� �����ε��ϴµ� ������ �Է��ϸ� ���ڿ� 10�� ���ؼ� ��ȯ���ִ� �Լ��� �ۼ��Ͻÿ�.
 */

public class Test03 {
	public Test03() {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���.");
		String str = scan.next();
		System.out.println("���ڸ� �Է��ϼ���.");
		int no = scan.nextInt();
		
		System.out.println(getData(str));
		System.out.println(getData(no));
		
		scan.close();
		
	}
	
	public static void main(String[] args) {
		new Test03();
	}
	
	public String getData(String str) {
		String msg = "###" + str;
		
		return msg;
	}
	
	public int getData(int no) {
		int num = 10 + no;
		
		return num;
	}
}
