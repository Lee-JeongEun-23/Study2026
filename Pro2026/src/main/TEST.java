package main;

public class TEST {

	public static void main(String[] args) {
		int n = 4;
		int gcd = gcd(n,6);		
		int answer = n / gcd;
		System.out.println(answer);
	}
	
	 public static int gcd(int a, int b) {
		while(b != 0) {
			int temp = a % b;
			a = b;
			b = temp;			
		}
		return a;
	}
	
	
	
}
/*
10	5
 * 
 */