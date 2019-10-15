package day04;

import java.util.*;

/*
 * �迭�� ����
 * 	1. ���� ���� : �ּҸ� ����
 * 
 * 	2. ���� ���� : �����͸� ����
 */

public class Test01 {
	
	public Test01(){
		int[] num1 = {3, 2, 6, 8, 9};
		int[] num2 = num1;
		int[] num3 = new int[5];
		
		System.out.println(Arrays.toString(num2));
		
		num1[0] = 1;
		System.out.println(Arrays.toString(num2));
		System.out.println(num1 == num2);
		
		System.arraycopy(num1, 0, num3, 0, num1.length);
		num1[0] = 1;
		System.out.println(Arrays.toString(num3));
		System.out.println(num1 == num3);
		
		// Wrapper Class�� �ڵ����� �� ����
		Object[] obj = new Object[10];
		obj[0] = "abcd"; //String type
		obj[1] = 1; // int -> Integer ��ȯ Boxing �ƴٰ� ��. �Ųٷ� �Ǹ� UnBoxing -> (int) ���� ����ȯ
		obj[2] = 3.14f; //Float type
		obj[3] = true; //Boolean type
		obj[4] = 'Z'; //Character type
		
		float result = (int)obj[1] + (float)obj[2];
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		new Test01();
	}
}
