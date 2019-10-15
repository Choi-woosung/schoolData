package day03;

/*
 * 정수를 10개 저장할 배열을 반환해주는 함수를 만든다.
 * 이 함수는 알파벳을 'A' ~ 'J' 무작위로 100번 발생시킬 때
 * 해당 알파벳이 발생한 횟수를 저장할 배열이다.
 * 그런데 이 배열은 정수를 저장할 배열이므로 자동 초기화가 이루어진다.
 * 만들어 놓으면 0으로 초기화 된다.
 * 따라서 배열을 만들고 발생한 알파벳의 위치에다 1을 누적시키면 된다.
 */

public class Ex05_Teach {
//	static int tmp;
	
	public Ex05_Teach() {
		// 1. 랜덤한 문자가 발생한 횟수를 저장한 배열을 얻고...
		int[] charCNT = getCnt();
		// getCnt() 함수는 반환값이 정수 10개를 관리할 배열이므로
		// 함수가 호출이 된다면 정수 10개를 담고있는 배열을 반환해 줄 것이기 때문에
		// 배열 변수에 그 반환값의 주소를 담을 수 있다.
		
		// 2. 각 문자에 해당하는 횟수를 출력한다.
		// 	그런데 배열이므로 반복해서 꺼내서 처리해 준다.
		
		// 일단 횟수만 꺼내보자.
		// 여기서는 배열이므로 제일 간단하게 사용할 수 있는 반복문은
		// 향상된 for 명령(forEach) 이다.
		for(int cnt : charCNT) {
//			System.out.println(cnt);
			for(int i = 0; i < cnt; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
//		for(int i = 0; i < 5; i++) {
//			tmp++;
//			if(tmp == 5) {
//				return;
//			}
//			System.out.println(tmp);
//		}
		new Ex05_Teach();
	}
	
	public int[] getCnt() {
		// 1. 반환해줄 배열을 만든다.
		int[] charCNT = new int[10];
		
		// 2. 무작위로 100번 문자를 발생시키고
		for(int i = 0; i < 100; i++) {
			// 'A'는 아스키코드 값이 65이므로 앞의 더블형 데이터에 65를 더한 값이 나온다.
			char ch = (char)(Math.random() * 10 + 'A');
			
			// 3. 위치에다 1을 누적 연산해서 집어넣는다.
			int loc = ch - 'A'; 
			// ch == 'A' -> 0
			// ch == 'B' -> 1
			// ...
			// ch == 'J' -> 9
			charCNT[loc] += 1;
		}
		
		// 4. 배열을 반환해준다.
		return charCNT;
		
		/*
		 * 함수의 반환값
		 * 	1. 반환값이 있는 경우
		 * 		- 반환값 타입에 해당 데이터 타입을 기술한다.
		 * 		==> 반환하는 방법
		 * 				return 데이터;
		 * 
		 * 	2. 반환값이 없는 경우
		 * 		- 함수의 반환값 타입에 void 라고 기술한다.
		 * 		==> [return;] return 을 써줄수도 있고 안 써줄수도 있다.
		 * 	
		 * 참고]
		 * 		***
		 * 		return 의 의미
		 * 			- 현재 실행되는 해당 함수르 종료하세요.
		 * 			- 반환값이 있으면 반환해주고 함수를 종료하세요.
		 */
	}
}
