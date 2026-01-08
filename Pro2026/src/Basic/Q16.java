package Basic;

/*
	< 배열의 평균값 >
	
	✔️결과 : +1
		
	정수 배열 numbers가 매개변수로 주어집니다.
	numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
	
	
	제한사항)
	0 ≤ numbers의 원소 ≤ 1,000
	1 ≤ numbers의 길이 ≤ 100
	정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.
*/

public class Q16 {
	public double solution(int[] numbers) {
        double temp = 0;
		for(int i = 0; i < numbers.length; i++) {
			temp += numbers[i];
		}
		double answer = temp / numbers.length;
        return answer;
    }
	
	// 챗지피티 추천 풀이
	/*
		double sum = 0;
	    for (int n : numbers) {
	        sum += n;
	    }
	    return sum / numbers.length;
    */
}