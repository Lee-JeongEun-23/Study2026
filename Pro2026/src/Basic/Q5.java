package Basic;

/*
	< 두 수의 나눗셈 > 
	
	✔️결과 : +1
		
	정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 solution 함수를 완성해주세요.
	
	제한사항)
	0 ≤ num1 ≤ 100
	0 ≤ num2 ≤ 100
*/

public class Q5 {
	public int solution(int num1, int num2) {
		int answer = (num1*1000)/num2;
        return answer;
    }
	
	// 다른분 풀이
	/*
		double result = (double) num1 / (double) num2;
        return (int) (result * 1000);
    */
}