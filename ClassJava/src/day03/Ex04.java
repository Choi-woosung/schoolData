package day03;

/*
 * ����]
 * 	�Ѷ���� ���̴� 1947m�̴�
 * 	�λ���� �ܱ����� �ѻ���� ���󿡼� 0.95m/s ��������
 * 	�ѻ���� �ؿ��� 0.75m/s �� �ö󰣴�.
 * 	�λ���� ���� �Ŀ� ��ǥ���� ����� �αٿ��� �������� ����ؼ� ����ϼ���.
 * 
 * 	��, �� ������ �ݺ������� �ذ��� �ϼ���.
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
