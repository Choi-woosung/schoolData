package day04;

import java.util.Arrays;

public class Test02_Teach {
	public Test02_Teach() {
		int arr[] = getIntArr();
		Arrays.sort(arr);
		int arr2[] = arr;
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
	
	public static void main(String[] args) {
		new Test02_Teach();
	}
	
	public int[] getIntArr() {
		int arr[] = new int[10];
		
		random:
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					continue random;
				}
			}
		}
		return arr;
	}
}
