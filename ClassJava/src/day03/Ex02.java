package day03;

import java.util.*;

/*
 * ���� 2]
 * 	�� �������� 7���� ���� �����ټ� �ִ� �Խ����� �ִ�.
 * 	��ĳ�ʷ� ������ ���ڸ� �Է¹޾Ƽ�
 * 	�� �Խ��ǿ� ��� �������� �ʿ����� ����ؼ� ��µǰ� �ϼ���.
 */

public class Ex02 {

	public Ex02() {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ϴ� �Խñ� ���ڸ� �Է��ϼ���.");
		int gulNum = scan.nextInt();
		int plusPage = 0;
			
		if(gulNum % 7 != 0) {
			plusPage = (gulNum / 7) + 1;
		}
		else {
			plusPage = gulNum / 7;
		}
		
		System.out.println("�ʿ��� �������� " + plusPage);
		
		scan.close();
		
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
