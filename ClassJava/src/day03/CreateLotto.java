package day03;

import java.util.*;

/*
 * ����]
 * 	�� ������ �ζǸ� ����� �迭�� ���� ����ϰ�
 * 	����ϼ���.
 * 	����� �迭�� ������ Ȯ���ϴ� �Լ��� ����ؼ� ó���ϼ���.
 */

public class CreateLotto {
	
	int[][] myLotto = new int[5][6];
	
	public CreateLotto() {
		/*
		 * 6���� �濡 �ϳ��� ���ʷ� �����ؼ�
		 * �����ϰ� 1 ~ 45 ������ ���ڸ� �����
		 * ���ʷ� �־��ָ� �ȴ�.
		 */
//		int k = 0;
		for(int n = 0; n < 5; n++) {
			start:
				for(int i = 0, k = 0; i < myLotto[n].length; i++, k++) {
//					System.out.println("�ݺ� Ƚ�� : " + k++);
					System.out.println("�ݺ� Ƚ�� : " + k);
					int no = (int) ((Math.random() * 45) + 1);
					
					for(int j = 0; j < i; j++) {
						if(myLotto[n][j] == no) {
							i--;
							continue start;
						}
					}
					// �� �κ��� ����ȴٴ� �ǹ̴�
					// �ٷ����� ��ȣ �ߺ�üũ�� �� ������ �ߺ��� ���� �����ٴ� ���̹Ƿ�
					// �߻��� ��ȣ�� �־��ָ� �ȴ�.
					myLotto[n][i] = no;
				}
			for(int i = 0; i < myLotto.length; i++) {
				System.out.println(Arrays.toString(myLotto[i]));
			}
		}
	}
	
	public static void main(String[] args) {
		new CreateLotto();
	}
	
	public void toTest() {
		// label�� ���� for ����� break(or continue)��
		// ���� ����ݺ����� ���ؼ��� ����ȴ�.
		
		for(int i = 0; i < 10; i++) {
			first:
			for(int j = 0; j < 5; j++) {
				
			}
		
			for(int j = 0; j < 10; j++) {
				if(j == 3) {
//					continue first; // ==> label�� ���� ����� �ݵ�� �����ִ� �ݺ����� ���ؼ��� ����ȴ�.
				}
			}
		}
	}

}
