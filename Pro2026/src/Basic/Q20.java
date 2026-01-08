package Basic;

/*
	< 배열 뒤집기 >
	
	✔️결과 : +1
		
	정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
	num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return 하도록 solution 함수를 완성해주세요.
	
	
	제한사항)
	1 ≤ num_list의 길이 ≤ 1,000
	0 ≤ num_list의 원소 ≤ 1,000
*/

public class Q20 {
	public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int temp = 0;
        for(int i = num_list.length-1; i >= 0; i--) {
            answer[temp] = num_list[i];
            temp ++;
        }
        return answer;
    }
	
	//★ 내 코드 좋지만, temp 없애면 더 좋은 코드

	
	// 챗지피티 추천 풀이
	/*
		int n = num_list.length;
	    int[] answer = new int[n];
	    for (int i = n - 1; i >= 0; i--) {
	        answer[n - 1 - i] = num_list[i];
	    }
	    return answer;
    */
}