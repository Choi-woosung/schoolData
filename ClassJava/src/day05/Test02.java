package day05;

public class Test02 {
	public Test02() {
//		int no = (int)(Math.random() * 201 - 100);
		/*
		 * �Լ� || Method
		 * 	�Լ� : Ŭ������ �������� ���� ����� ������ ��.
		 * 	Method : Ŭ�������� ���������(Ŭ������ �����ְ�) ����� ������ ��.
		 * 
		 * 	== ���
		 */
		System.out.println("0. ������ �Լ��� ó�� ���� �κ�");
		
		abc();
		
		System.out.println("2 - �Լ� ���� ��");
	}
	
	public static void main(String[] args) {
		System.out.println("#### ����� main() �Լ� ���� ù ����");
		new Test02();
		
		System.out.println("***** ����� ������ ȣ��");
	}
	
	public void abc() {
		System.out.println("1 - abc");
	}
}
