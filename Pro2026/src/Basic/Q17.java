package Basic;

/*
	< 옷가게 할인 받기 >
	
	✔️결과 : +2
		
	머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
	구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
	
	
	제한사항)
	10 ≤ price ≤ 1,000,000
	price는 10원 단위로(1의 자리가 0) 주어집니다.
	소수점 이하를 버린 정수를 return합니다.
*/

public class Q17 {
	public int solution(int price) {
        int answer = price;
		
		if(price >= 500000) {
			answer = (int)(Math.floor(price*0.8));
		}else if(price >= 300000 && price < 500000) {
			answer = (int)(Math.floor(price*0.9));
		}else if(price >= 100000 && price < 300000) {
			answer = (int)(Math.floor(price*0.95));
		}
        return answer;
    }
	//★ Math.floor() 불필요, (int)로 변환하면 자바에서 소수점 버림(truncation)이어서 floor랑 결과가 같음(양수라서)
	
	// 챗지피티 추천 풀이
	/*
		if (price >= 500000) return price * 80 / 100;
	    if (price >= 300000) return price * 90 / 100;
	    if (price >= 100000) return price * 95 / 100;
	    return price;
    */
}