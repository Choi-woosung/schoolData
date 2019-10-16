package day05;

import java.util.Scanner;

/*
 * 1. 문자열을 입력하면 문자열 앞에 "###"을 붙여서 반환해주는 함수를 작성하고
 * 2. 이 함수를 오버로딩하는데 정수를 입력하면 숫자에 10을 더해서 반환해주는 함수룰 작성하시오.
 */

public class Test03 {
	public Test03() {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.");
		String str = scan.next();
		System.out.println("숫자를 입력하세요.");
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
