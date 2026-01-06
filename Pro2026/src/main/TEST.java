package main;

public class TEST {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int temp = 0;
		for(int i = 0; i < numbers.length; i++) {
			temp += numbers[i];
		}
		int answer = temp / numbers.length;

		
		System.out.println(answer);
	}

	
	
	
}
/*
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]	5.5
[89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99]	94.0
 * 
 */