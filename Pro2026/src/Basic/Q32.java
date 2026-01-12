package Basic;

/*
	< 순서쌍의 개수 >
	
	✔️결과 : +1
		
	순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다.
	자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return 하도록 solution 함수를 완성해주세요.
	
	
	제한사항)
	1 ≤ n ≤ 1,000,000
*/

public class Q32 {
	public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
	    	if(n%i == 0) {
	    		answer ++;
	    	}
	    }
        return answer;
    }
	
	//★ 시간복잡도가 아쉬움
	
	// 챗지피티 추천 풀이
	/*
		int answer = 0;
	    for (int i = 1; i * i <= n; i++) {
	        if (n % i == 0) {
	            answer += 2;              // 약수는 쌍으로 나오므로 √n까지만 확인
	            if (i * i == n) answer--; // 제곱수면 중복 제거
	        }
	    }
	    return answer;
    */
}