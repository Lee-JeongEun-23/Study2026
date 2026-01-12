package Basic;

/*
	< 외계행성의 나이 >
	
	✔️결과 : +1
		
	우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다.
	입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다.
	a는 0, b는 1, c는 2, ..., j는 9입니다.
	예를 들어 23살은 cd, 51살은 fb로 표현합니다.
	나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.
	
	
	제한사항)
	age는 자연수입니다.
	age ≤ 1,000
	PROGRAMMERS-962 행성은 알파벳 소문자만 사용합니다.
*/

public class Q30 {
	public String solution(int age) {
        StringBuilder sb = new StringBuilder(String.valueOf(age).length());
	    
	    while(age/10 != 0) {
	    	sb.append((char)(97+(age%10)));
	    	age = age/10;
	    }
	    sb.append((char)(97+(age%10)));
	    sb.reverse();
        return sb.toString();
    }
	
	//내 코드 개선
	/*
		StringBuilder sb = new StringBuilder();
	    while (age > 0) {
	        sb.append((char) ('a' + (age % 10)));
	        age /= 10;
	    }
	    return sb.reverse().toString();
	*/

	
	// 챗지피티 추천 풀이
	/*
		String s = String.valueOf(age);
	    StringBuilder sb = new StringBuilder(s.length());
	    for (int i = 0; i < s.length(); i++) {
	        int digit = s.charAt(i) - '0';
	        sb.append((char) ('a' + digit));
	    }
	    return sb.toString();
    */
}