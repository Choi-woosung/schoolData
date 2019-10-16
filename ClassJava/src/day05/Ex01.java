package day05;

import java.util.*;

/*
 * 5명의 학생의 점수를 관리할 배열을 만드는데
 * 배열에는 정수형으로 데이터를 저장할 것이다.
 * 그런데 각 학생들의 정보는 학생번호, 국어, 영어, 수학, 과학, 사회 의 점수를 랜덤하게 만들어 입력하고
 * 총점을 구해서 입력할 예정이다.
 * 
 * 학생의 이름은 문자열 배열을 별도로 만들어서 저장할 예정이다.
 * 
 * 배열을 만들고 출력하세요.
 * 	출력 예]
 * 		홍길동 : 50 | 70 | 80 | 90 | 40 | 총점
 * 
 * =========================================================================================================
 * 위 문제가 해결이 되면 평균도 구해서 출력하세요.
 * =========================================================================================================
 * 석차도 구해서 정렬하고 출력하세요.
 */

public class Ex01 {
	public Ex01() {
		String[] studentName = {"김", "홍", "강", "최", "박"};
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
			System.out.print("총점 : " + total[i] + " | ");
			System.out.println("평균 : " + (total[i] / 5d));
		}
		for(int i = 0; i < no.length; i++) {
			no[i] = total[i];
		}
		Arrays.sort(no);
		System.out.println(Arrays.toString(no));
		for(int i = 0; i < total.length; i++) {
			for(int j = 0; j < no.length; j++) {
				if(total[i] == no[j]) {
					System.out.println(studentName[i] + "은 " + (5 - j) + "등 입니다.");
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
//					System.out.println(studentName[i] + "은 " + k + "등 입니다.");
//				}
//			}
//		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
