package day04;

import java.util.Arrays;

/*
 * 배열 정렬하기
 * 	0 ~ 99 까지의 숫자를 랜덤하게 10개 만들어서 배열에 저장하고
 * 	크기가 작은 순으로 배열을 정렬하세요.
 */

public class Test02 {
	public Test02() {
		int[] result = getNum();
		System.out.println(Arrays.toString(result));
	}
	
	public static void main(String[] args) {
		new Test02();
	}
	
	static int[] getNum() {
		int[] arrNum = new int[10];
		
		random:
		for(int i = 0; i < arrNum.length; i++) {
			arrNum[i] = (int) (Math.random() * 100);
			for(int j = 0; j < i; j++) {
				if(arrNum[i] == arrNum[j]) {
					i--;
					continue random;
				}
			}
		}
		
		for(int i = 0; i < arrNum.length; i++) {
			int tmp;
			
			for(int j = i + 1; j < arrNum.length; j++) {
				if(arrNum[i] > arrNum[j]) {
					tmp = arrNum[i];
					arrNum[i] = arrNum[j];
					arrNum[j] = tmp;
				}
			}
		}
		return arrNum;
	}
}
