package Basic;

/*
	< 숫자 비교하기 > 
	
	✔️결과 : +1
		
	정수 num1과 num2가 매개변수로 주어집니다.
	두 수가 같으면 1 다르면 -1을 retrun 하도록 solution 함수를 완성해주세요.
	
	
	제한사항)
	0 ≤ num1 ≤ 10,000
	0 ≤ num2 ≤ 10,000
*/

public class Q6 {
	public int solution(int num1, int num2) {
		int answer = -1;
        if(num1 == num2) answer = 1;
        return answer;
    }
	
	// 다른분 풀이
	/*
		int answer = (num1 == num2) ? 1 : -1;
        return answer;
    */
}