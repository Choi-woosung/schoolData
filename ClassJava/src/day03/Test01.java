package day03;

import java.util.Arrays;

/*
 * ������ ���� �߻��ϱ�
 * 	java.lang.Math.random()
 * 		- 0���� ũ�ų� ����
 */

public class Test01 {
	
	// �⺻������Ÿ���� ��������� �ڵ� �ʱ�ȭ�� �ȴ�.
	int no1;
	boolean bool;
	char ch;
	float fl;
	
	public Test01() {
//		for(int i = 0; i < 5; i++) {
//			System.out.println(Math.random());
//		}
		
		/*
		 * �迭 : ���� ������ �����͸� ������ ��Ƽ� �Ѳ����� �����ϴ� �ڷ���
		 * 		  ���̰� �ְ� �ε����� �����ϴ� ������ Ÿ���̴�.
		 * 
		 * 	���ǻ���]
		 * 		�ݵ�� ���� �� ������ Ÿ�԰� ���̸� ���ؾ� �ȴ�.
		 * 		�ѹ� ������� �迭�� ���̸� ���� ���Ѵ�.
		 * 
		 * 	����]
		 * 		������ Ÿ��[] �����̸� = {������1, ������2, ...};
		 * 		������ Ÿ��[] �����̸� = new ������Ÿ��[����];
		 * 		������ Ÿ��[] �����̸� = new ������Ÿ��[]{������1, ������2, ...};
		 * 
		 * 	����]
		 * 		�迭�� ������ Ȯ���ϴ� �Լ�
		 * 		Arrays.toString(�迭�ּ�)
		 */
		
		int num[] = new int[] {1, 2, 3, 4, 5};
		
		System.out.println("���� for ������� ����غ���.");
		for(int arrNum : num) {
			System.out.println(arrNum);
		}
		
		System.out.println("num toString : " + Arrays.toString(num));
		System.out.println("num length : " + num.length);
		// toString() �Լ��� ȣ���� �� ������� �迭�� �ּҸ� �Է�
		// �ڹٿ����� �޸��� �ּҸ� ���� ������ �� ����
		// �� �ּҸ� ������ ����ϵ��� �ϰ� �ִ�.
		// ���� �迭�� �ּҸ� ����ϰ� �ִ� ������ �Է����ָ� �ȴ�.
		
		/*
		 * String str = "abcd";
		 * String str2 = new String();
		 */
		
		String str1 = "abcd";
		String str2 = new String("abcd");
		String str3	=  new String("abcd");
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		
		System.out.println("-------------------------");
		
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		
		System.out.println("member var : " + no1 + " | " + bool + " | " + ch + " | " + fl);
		
		int[] num2 = new int[10];
		System.out.println(Arrays.toString(num2));
		
		String[] str4 = new String[10];
		System.out.println(Arrays.toString(str4));
		
//		for(int i = 0; i < 5; i++) {
//			int no = (int) (Math.random() * 3);
//			System.out.println(no);
//		}
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}
