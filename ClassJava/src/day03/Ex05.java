package day03;

import java.util.*;

/*
 * 문제]
 * 	'A' ~ 'J' 까지 임의의 문자를 랜덤하게 100개 발생시킨 후
 * 	각 문자가 몇번씩 중복이 발생했는지 출력하세요.
 * 	중복된 횟수를 *로 표시하세요.
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
			System.out.println(arrCh[i] + "의 중복횟수 : " + count);
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
