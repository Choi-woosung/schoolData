package day03;

import java.util.*;

/*
 * 문제 2]
 * 	한 페이지에 7개의 글을 보여줄수 있는 게시판이 있다.
 * 	스캐너로 임의의 숫자를 입력받아서
 * 	이 게시판에 몇개의 페이지가 필요한지 계산해서 출력되게 하세요.
 */

public class Ex02 {

	public Ex02() {
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 게시글 숫자를 입력하세요.");
		int gulNum = scan.nextInt();
		int plusPage = 0;
			
		if(gulNum % 7 != 0) {
			plusPage = (gulNum / 7) + 1;
		}
		else {
			plusPage = gulNum / 7;
		}
		
		System.out.println("필요한 페이지는 " + plusPage);
		
		scan.close();
		
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
