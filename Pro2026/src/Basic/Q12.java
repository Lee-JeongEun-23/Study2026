package Basic;

/*
	< 짝수는 싫어요 >
	
	✔️결과 : +1
		
	정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return 하도록 solution 함수를 완성해주세요.
	
	
	제한사항)
	1 ≤ n ≤ 100
*/

public class Q12 {
	public int[] solution(int n) {
        int[] answer = {};
		int idx = 0;
		int max = n/2;
		if(n%2 == 0) {
			answer = new int[n/2];
		}else {
			answer = new int[n/2+1];
			answer[n/2] = n;
		}
		while(idx < max) {
			answer[idx] = 2*idx + 1;
			idx++;
		}
        return answer;
    }
	
	// 가장 좋은 풀이
	/*
		public int[] solution(int n) {
		    int size = (n + 1) / 2; //홀수 개수 구하는 공식 (참고 : 짝수 개수 구하는 공식 n/2)
		    int[] answer = new int[size];
		
		    for (int i = 0; i < size; i++) {
		        answer[i] = 2 * i + 1;
		    }
		    return answer;
		}
    */
}