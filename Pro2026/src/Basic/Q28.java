package Basic;

/*
	< 짝수의 합 >
	
	✔️결과 : +1
		
	정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
	
	
	제한사항)
	0 < n ≤ 1000
*/

public class Q28 {
	public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n/2; i++) {
	    	answer += (i*2);
	    }
        return answer;
    }
	
	// 다른분 풀이
	/*
		int answer = 0;
        for(int i=2; i<=n; i+=2){
            answer+=i;
        }
        return answer;
    */
}