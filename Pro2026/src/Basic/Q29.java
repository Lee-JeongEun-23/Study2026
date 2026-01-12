package Basic;

/*
	< 배열 자르기 >
	
	✔️결과 : +1
		
	정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
	
	
	제한사항)
	2 ≤ numbers의 길이 ≤ 30
	0 ≤ numbers의 원소 ≤ 1,000
	0 ≤num1 < num2 < numbers의 길이
*/

public class Q29 {
	public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
	    int temp = 0;
	    for(int i = num1; i <= num2; i++) {
	    	answer[temp] = numbers[i];
	    	temp++;
	    }
        return answer;
    }
	
	//내 코드 개선
	/*
		int[] answer = new int[num2 - num1 + 1];
	    for (int i = num1; i <= num2; i++) {
	        answer[i - num1] = numbers[i];
	    }
	    return answer;
	*/

	
	// 다른분 풀이
	/*
		return Arrays.copyOfRange(numbers, num1, num2 + 1);
    */
}