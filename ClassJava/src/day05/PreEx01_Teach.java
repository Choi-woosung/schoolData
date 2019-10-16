package day05;

import java.util.*;

public class PreEx01_Teach {
	/*
	 * 배열을 만들게 되면
	 * Heap 영역에 만들게 되는데
	 * 이때 배열이 관리할 타입을 정해줘야 한다.
	 * 
	 * 이때 Heap 영역에 만들게 되는 것의 데이터타입을 Heap Type이라고 부른다.
	 * 
	 * 그런데 배열은 이 Heap Type이 같은 것들만 넣을 수 있다.
	 */
	public PreEx01_Teach() {
		int[][] chArr = new int[2][10];
		
//		int[] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
//		
//		chArr[0] = ch;
		
		// 2차원 배열의 첫방에 대문자 'A' ~ 'J' 까지 채운다.
		for(int i =0; i < 10; i++) {
			chArr[0][i] = 65 + i;
		}
		
		//대문자를 랜덤하게 발생시켜서 두번째방의 배열의 해당방의 카운트를 1 올려준다.
		for(int i = 0; i < 100; i++) {
			int index = (int) (Math.random() * 10);
			chArr[1][index] += 1;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println((char) (chArr[0][i]) + " : " + chArr[1][i]);
		}
		
		System.out.println(Arrays.deepToString(chArr));
		System.out.println(Arrays.toString(chArr));
	}
	
	public static void main(String[] args) {
		new PreEx01_Teach();
	}
}
