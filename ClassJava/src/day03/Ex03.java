package day03;

import java.util.*;

/*
 * 3�ڸ� ���ڸ� �Է¹޾Ƽ�(100 ~ 999 ������ ����)
 * �� ���ڿ��� ���� ����� 100�� ����� ����� ���ؼ�
 * �󸶰� �ʿ����� ����Ͽ� ����Ͻÿ�.
 * 
 * ��]
 * 	231�� 200�� �����Ƿ� 31�� �����Ѵ�.
 * 	578�� 600�� �����Ƿ� 22�� ��������Ѵ�.
 */

public class Ex03 {

	public Ex03() {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ϴ� 3�ڸ� ���ڸ� �Է��ϼ���.");
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
