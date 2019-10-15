package day03;

/*
 * 배열 :
 * 	==> 같은 형태의 데이터를 여러개 모아서 한꺼번에 관리할 때
 * 
 * 	결론]
 * 		하나의 변수를 이용해서 여러개의 데이터를 관리할 때
 * 
 * 	참고]
 * 		자바에서 사용하는 변수의 타입
 * 			1.기본형
 * 				기본데이터 타입을 저장할 변수
 * 					boolean,
 * 					char,
 * 					byte, short, int, long,
 * 					float, double
 * 				이 여덟가지를 말한다.
 * 
 * 			2.참조형
 * 				기본형 이외의 모든 데이터 타입
 * 				변수가 기억하는 것은 인스턴스의 주소를 기억한다.
 * 		참고]
 * 			Heap 영역
 * 				특징
 * 					1. 반드시 주소를 알아야 사용할 수 있는 영역
 * 					2. 8가지 영역중에서 크기가 가장 큰 영역이며
 * 						확장이 가능하다.
 * 						(모자르면 다른 영역을 가져와서 사용한다.)
 * 						따라서 자바에서는 데이터가 필요하다면
 * 						Heap 영역에 기억하도록 되어있다.
 * 					3. 원칙적으로 한번 만들어지면 그 프로그램이 종료될 때까지 없어지지 않는 영역이다.
 * 					4. Heap 영역에 생기는 메모리는 자동 초기화 된다.
 * -----------------------------------------------------------------------------------------------------
 * 
 * 배열 만드는 방법
 * 	1. 만들 배열이 Heap에 생길 때 그 주소를 기억할 변수를 준비한다.
 * 		형식]
 * 			데이터타입[] 변수이름;
 * 2. 변수가 준비 되었다면 준비된 변수에 Heap에 필요한 메모리를 만들고 그 주소를 기억시킨다.
 * 		형식]
 * 			변수이름 = new 데이터타입[갯수];
 * 
 * 배열을 사용하는 방법
 * 	형식]
 * 		변수이름[위치];
 * 		참고 : 위치는 index값을 의미하고 0부터 시작한다.
 * 
 * 배열의 길이를 알아내는 방법
 * 	형식]
 * 		배열변수.length;
 * 		==> 배열변수가 관리하는 Heap 영역의 메모리의 갯수
 * 	참고]
 * 		Heap에 만들어지는 변수들은 자동초기화가 된다.
 * 		==> 인스턴스가 만들어질 때 기본값으로 셋팅이 된다.
 * 			int, byte, short, long = 0;
 * 			float, double = 0.0;
 * 			boolean = false;
 * 			char = ' ';
 * 
 * 	참고]
 * 		배열의 초기화
 * 		==> 기본 데이터 타입의 배열은 데이터를 입력해주지 않는다면
 * 			기본값으로 자동 초기화 된다.
 * 			만약 기본값 이외의 데이터로 입력해줘야 하는 경우도 있을 수 있다.
 * 			이때 강제로 특정 값으로 입력하는 것을 배열의 초기화라고 한다.
 * 
 * 	형식]
 * 		1.
 * 			데이터타입[] 변수이름 = {데이터 1, 데이터 2, 데이터 3, ...};
 * 		2.
 * 			데이터타입[] 변수이름 = new 데이터타입[]{데이터1, 데이터2, ...};
 * 
 * 	* 주의사항]
 * 		배열을 선언과 동시에 초기화하는 경우는
 * 		배열의 길이를 입력하지 못한다.
 * 		왜냐하면 입력하는 데이터의 갯수에 의해서 배열의 길이가 정해지므로
 * 		입력하는 갯수에 따라서 자동으로 배열의 크기가 결정이 된다.
 * 
 * --------------------------------------------------------------------------------
 * 
 * 	참고]
 * 		Arrays.toString() 함수
 * 		==> 원칙적으로 배열의 데이터를 확인을 하려면
 * 			해당 위치에 접근해서 데이터를 꺼내오는 방식으로
 * 			for 반복문을 사용해서 처리해야 하지만
 * 			단순히 배열의 데이터를 확인만 하는 경우에는 반복문 처리는 불편하다.
 * 		==> Arrays 클래스는 배열을 다룰 때 사용하는 기능을 모아놓은 클래스이고
 * 			이 클래스 안에 배열의 내용을 확인하는 기능을 가진 함수가 포함되어 있다.
 * 				Arrays.toString(배열변수)
 * 
 * ==================================================================================
 * 위의 내용은 1차원 배열이고
 * 배열 내부에 다시 배열이 들어가는 배열이 있는데
 * 이것을 다차원 배열이라 한다.
 * 이 다차원 배열은 결국 같은 타입의 데이터가 들어있는 배열들을 다시 배열에 담은 것이다. 
 * 
 * 	형식]
 * 		이차원 배열
 * 			데이터타입[][] 변수이름 = new 데이터타입[외부갯수][내부배열갯수];
 */

public class Test02 {

	public Test02() {
		
	}
	
	public static void main(String[] args) {
		new Test02();
	}

}
