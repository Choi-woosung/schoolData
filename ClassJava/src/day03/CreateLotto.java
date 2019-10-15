package day03;

import java.util.*;

/*
 * 예제]
 * 	한 게임의 로또를 기억할 배열을 만들어서 기억하고
 * 	출력하세요.
 * 	출력은 배열의 내용을 확인하는 함수를 사용해서 처리하세요.
 */

public class CreateLotto {
	
	int[][] myLotto = new int[5][6];
	
	public CreateLotto() {
		/*
		 * 6개의 방에 하나씩 차례로 접근해서
		 * 랜덤하게 1 ~ 45 까지의 숫자를 만들고
		 * 차례로 넣어주면 된다.
		 */
//		int k = 0;
		for(int n = 0; n < 5; n++) {
			start:
				for(int i = 0, k = 0; i < myLotto[n].length; i++, k++) {
//					System.out.println("반복 횟수 : " + k++);
					System.out.println("반복 횟수 : " + k);
					int no = (int) ((Math.random() * 45) + 1);
					
					for(int j = 0; j < i; j++) {
						if(myLotto[n][j] == no) {
							i--;
							continue start;
						}
					}
					// 이 부분을 실행된다는 의미는
					// 바로위의 번호 중복체크를 다 했지만 중복된 것이 없었다는 것이므로
					// 발생한 번호를 넣어주면 된다.
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
		// label이 붙은 for 명령은 break(or continue)가
		// 오직 직계반복문에 한해서만 적용된다.
		
		for(int i = 0; i < 10; i++) {
			first:
			for(int j = 0; j < 5; j++) {
				
			}
		
			for(int j = 0; j < 10; j++) {
				if(j == 3) {
//					continue first; // ==> label이 붙은 명령은 반드시 속해있는 반복문에 한해서만 적용된다.
				}
			}
		}
	}

}
