package day05;

import java.util.*;

/*
 * 5���� �л��� ������ ������ �迭�� ����µ�
 * �迭���� ���������� �����͸� ������ ���̴�.
 * �׷��� �� �л����� ������ �л���ȣ, ����, ����, ����, ����, ��ȸ �� ������ �����ϰ� ����� �Է��ϰ�
 * ������ ���ؼ� �Է��� �����̴�.
 * 
 * �л��� �̸��� ���ڿ� �迭�� ������ ���� ������ �����̴�.
 * 
 * �迭�� ����� ����ϼ���.
 * 	��� ��]
 * 		ȫ�浿 : 50 | 70 | 80 | 90 | 40 | ����
 * 
 * =========================================================================================================
 * �� ������ �ذ��� �Ǹ� ��յ� ���ؼ� ����ϼ���.
 * =========================================================================================================
 * ������ ���ؼ� �����ϰ� ����ϼ���.
 */

public class Ex01 {
	public Ex01() {
		String[] studentName = {"��", "ȫ", "��", "��", "��"};
		int[] score = new int[5];
		int[] total = new int[5];
		int[] no = new int[5];
		
		for (int i = 0; i < studentName.length; i++) {
			System.out.print(studentName[i] + " : ");
			for (int j = 0; j < score.length; j++) {
				score[j] = (int) (Math.random() * 100 + 1);
				total[i] += score[j];
				System.out.print(score[j] + " | ");
			}
			System.out.print("���� : " + total[i] + " | ");
			System.out.println("��� : " + (total[i] / 5d));
		}
		for(int i = 0; i < no.length; i++) {
			no[i] = total[i];
		}
		Arrays.sort(no);
		System.out.println(Arrays.toString(no));
		for(int i = 0; i < total.length; i++) {
			for(int j = 0; j < no.length; j++) {
				if(total[i] == no[j]) {
					System.out.println(studentName[i] + "�� " + (5 - j) + "�� �Դϴ�.");
				}
			}
		}
//		for(int i =0; i < no.length; i++) {
//			for(int j = i + 1; j < no.length; j++) {
//				if(no[i] > no[j]) {
//					int tmp = no[i];
//					no[i] = no[j];
//					no[j] = tmp;
//					
//				}
//			}
//		}
//		for(int i = 0; i < total.length; i++) {
//			for(int k = 1; k < no.length; k++) {
//				if(total[i] == no[k]) {
//					System.out.println(studentName[i] + "�� " + k + "�� �Դϴ�.");
//				}
//			}
//		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
