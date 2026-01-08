package Basic;

/*
	< 뒤집힌 문자열 >
	
	✔️결과 : +1
		
	문자열 my_string이 매개변수로 주어집니다.
	my_string을 거꾸로 뒤집은 문자열을 return 하도록 solution 함수를 완성해주세요.
	
	
	제한사항)
	1 ≤ my_string의 길이 ≤ 1,000
*/

public class Q21 {
	public String solution(String my_string) {
        String answer = "";
        String[] arr = my_string.split("");

        for(int i = arr.length-1; i >= 0; i--) {
            answer += arr[i];
        }
        return answer;
    }
	
	//★ split("")는 내부적으로 배열 만들고(메모리/시간) 비용이 큼, answer += ...는 O(n^2) 될 수 있음

	
	// 다른분 풀이
	/*
		return new StringBuilder(my_string).reverse().toString();
    */
}