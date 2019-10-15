package day03;

/*
 * 문제]
 * 	한라산의 높이는 1947m이다
 * 	두사람의 외국인이 한사람은 정상에서 0.95m/s 내려오고
 * 	한사람은 밑에서 0.75m/s 로 올라간다.
 * 	두사람은 몇초 후에 지표에서 몇미터 부근에서 만나는지 계산해서 출력하세요.
 * 
 * 	단, 이 문제는 반복문으로 해결을 하세요.
 */

public class Ex04 {

	public Ex04() {
		double move1 = 1947;
		double move2 = 0;
		double move1Spd = 0.95;
		double move2Spd = 0.75;
		
		while(move1 >= move2) {
			move1 -= move1Spd;
			move2 += move2Spd;
		}
		System.out.println(move1);
		System.out.println(move2);
	}
	
	public static void main(String[] args) {
		new Ex04();
	}
}
