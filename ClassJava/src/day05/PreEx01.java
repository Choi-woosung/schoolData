package day05;

import java.util.Arrays;

/*
 * 문제 1]
 * 	'A' ~ 'J' 까지 임의의 문자를 랜덤하게 100개
 * 	발생시킨 후 2차원배열에 저장하고
 * 	각문자가 몇번씩 발생했는지도 문자들이 들어있는 배열에 저장해서 출력하세요.
 */

public class PreEx01 {
	public PreEx01() {
		int[][] chArr = new int[2][10];
		
		int[] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
		
		chArr[0] = ch;
		
		for(int i = 0; i < 100; i++) {
			int choose = (int) (Math.random() * 10);
			chArr[1][choose] += 1;
			
//			switch(choose) {
//			case 0:
//				chArr[1][0] += 1;
//				break;
//			case 1:
//				chArr[1][1] += 1;
//				break;
//			case 2:
//				chArr[1][2] += 1;
//				break;
//			case 3:
//				chArr[1][3] += 1;
//				break;
//			case 4:
//				chArr[1][4] += 1;
//				break;
//			case 5:
//				chArr[1][5] += 1;
//				break;
//			case 6:
//				chArr[1][6] += 1;
//				break;
//			case 7:
//				chArr[1][7] += 1;
//				break;
//			case 8:
//				chArr[1][8] += 1;
//				break;
//			case 9:
//				chArr[1][9] += 1;
//				break;
//			default:
//				System.out.println("프로그램 오류");
//			}
		}
//		for(int i = 0; i < chArr[0].length; i++) {
//			System.out.print((char) chArr[0][i] + ", ");
//		}
		System.out.println();
		System.out.println(Arrays.toString(chArr[1]));
	}
	
	public static void main(String[] args) {
		new PreEx01();
	}
}
