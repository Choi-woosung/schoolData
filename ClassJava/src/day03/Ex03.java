package day03;

import java.util.*;

/*
 * 3자리 숫자를 입력받아서(100 ~ 999 사이의 숫자)
 * 이 숫자에서 가장 가까운 100의 배수를 만들기 위해서
 * 얼마가 필요한지 계산하여 출력하시오.
 * 
 * 예]
 * 	231은 200에 가까우므로 31을 빼야한다.
 * 	578은 600에 가까우므로 22를 더해줘야한다.
 */

public class Ex03 {

	public Ex03() {
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 3자리 숫자를 입력하세요.");
		int num = scan.nextInt();
		
		if(num % 100 > 50) {
			System.out.println(((num / 100) * 100 + 100) - num);
		}
		else {
			System.out.println(num - (num / 100 * 100));
		}
		
		scan.close();
	}
	
	public static void main(String[] args) {
		new Ex03();
	}

}
