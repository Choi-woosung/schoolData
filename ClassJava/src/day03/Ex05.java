package day03;

import java.util.*;

/*
 * ����]
 * 	'A' ~ 'J' ���� ������ ���ڸ� �����ϰ� 100�� �߻���Ų ��
 * 	�� ���ڰ� ����� �ߺ��� �߻��ߴ��� ����ϼ���.
 * 	�ߺ��� Ƚ���� *�� ǥ���ϼ���.
 */

public class Ex05 {

	public Ex05() {
		char[] arrCh = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
		char[] result = new char[100];
//		String[] count = new String[10];
		int count = 0;
		
		for(int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 10);
			result[i] = arrCh[num];
			
//			for(int j = 0; j < i; j++) {
//				if(result[j] == result[i]) {
//					for(int k = 0; k < arrCh.length; k++) {
//						if(arrCh[k] == result[i]) {
//							if(count[k] == null) {
//								count[k] = "*";
//							}
//							else {
//								count[k] += "*";
//							}
//						}
//					}
//				}
//			}
		}
		for(int i = 0; i < arrCh.length; i++) {
			for(int j = 0; j < result.length; j++) {
				if(arrCh[i] == result[j]) {
					count += 1;
				}
			}
			System.out.println(arrCh[i] + "�� �ߺ�Ƚ�� : " + count);
			count = 0;
		}
		System.out.println(Arrays.toString(result));
//		for(int i = 0; i < count.length; i++) {
//			System.out.println(arrCh[i] + " : " + count[i]);
//		}
	}
	
	public static void main(String[] args) {
		new Ex05();
	}

}
