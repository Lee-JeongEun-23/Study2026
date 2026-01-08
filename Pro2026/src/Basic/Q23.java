package Basic;

/*
	< 짝수 홀수 개수 >
	
	✔️결과 : +1
		
	정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
	
	
	제한사항)
	1 ≤ num_list의 길이 ≤ 100
	0 ≤ num_list의 원소 ≤ 1,000
*/

public class Q23 {
	public int[] solution(int[] num_list) {
        int[] answer = new int[2];
	    for(int i = 0; i < num_list.length; i++) {
	    	if(num_list[i]%2 == 0) {
	    		answer[0] += 1;
	    	}else {
	    		answer[1] += 1;
	    	}
	    }
        return answer;
    }
	
	//내 코드 개선
	/*
		for (int num : num_list) {
		    if (num % 2 == 0) answer[0]++;
		    else answer[1]++;
		}
	*/
}