package day05;

public class Test02 {
	public Test02() {
//		int no = (int)(Math.random() * 201 - 100);
		/*
		 * 함수 || Method
		 * 	함수 : 클래스의 속해있지 않은 기능을 구현한 것.
		 * 	Method : 클래스내에 만들어지고(클래스에 속해있고) 기능을 구현한 것.
		 * 
		 * 	== 기능
		 */
		System.out.println("0. 생성자 함수내 처음 실행 부분");
		
		abc();
		
		System.out.println("2 - 함수 실행 후");
	}
	
	public static void main(String[] args) {
		System.out.println("#### 여기는 main() 함수 실행 첫 문장");
		new Test02();
		
		System.out.println("***** 여기는 생성자 호출");
	}
	
	public void abc() {
		System.out.println("1 - abc");
	}
}
