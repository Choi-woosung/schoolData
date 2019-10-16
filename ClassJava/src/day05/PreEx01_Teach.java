package day05;

import java.util.*;

public class PreEx01_Teach {
	/*
	 * �迭�� ����� �Ǹ�
	 * Heap ������ ����� �Ǵµ�
	 * �̶� �迭�� ������ Ÿ���� ������� �Ѵ�.
	 * 
	 * �̶� Heap ������ ����� �Ǵ� ���� ������Ÿ���� Heap Type�̶�� �θ���.
	 * 
	 * �׷��� �迭�� �� Heap Type�� ���� �͵鸸 ���� �� �ִ�.
	 */
	public PreEx01_Teach() {
		int[][] chArr = new int[2][10];
		
//		int[] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
//		
//		chArr[0] = ch;
		
		// 2���� �迭�� ù�濡 �빮�� 'A' ~ 'J' ���� ä���.
		for(int i =0; i < 10; i++) {
			chArr[0][i] = 65 + i;
		}
		
		//�빮�ڸ� �����ϰ� �߻����Ѽ� �ι�°���� �迭�� �ش���� ī��Ʈ�� 1 �÷��ش�.
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
