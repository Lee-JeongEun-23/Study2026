package Basic;

/*
	< 분수의 덧셈 >
	
	✔️결과 : +1
		
	첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
	두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
	
	
	제한사항)
	0 <numer1, denom1, numer2, denom2 < 1,000
*/

public class Q7 {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] result = new int[2];
        
        int nTemp = (denom1*numer2)+(numer1*denom2);
		int dTemp = denom1*denom2;
		
		int gcd = gcd(nTemp, dTemp);
		
		result[0] = nTemp / gcd;
		result[1] = dTemp / gcd;
        
        return result;
    }
    
    public static int gcd(int a, int b) {
		while(b != 0) {
			int temp = a % b;
			a = b;
			b = temp;			
		}
		return a;
	}
	
	// 기존 풀이 > 비추천 코드
	/*
		public int[] solution(int numer1, int denom1, int numer2, int denom2) {
	        int[] arr = new int[2];
	        if(denom1 % numer1 == 0) {
				denom1 = denom1 / numer1;
				numer1 = 1;
			}
			if(denom2 % numer2 == 0) {
				denom2 = denom2 / numer2;
				numer2 = 1;
			}
	        if(denom1 < denom2) {
				if(denom2 % denom1 == 0) {
					arr[1] = denom2;
					arr[0] = (denom2 / denom1) * numer1 + numer2;
				}else {
					arr[1] = (denom1 * denom2 / gcd(denom1, denom2));
					int a = 0, b = 0;
					a = (arr[1] / denom1) * numer1;
					b = (arr[1] / denom2) * numer2;
					arr[0] = a+b;
				}
			}else if(denom1 == denom2) {
				if((numer1+numer2) % denom1 == 0) {
					arr[0] = (numer1+numer2) / denom1;
					arr[1] = 1;
				}else {
					arr[0] = numer1+numer2;
					arr[1] = denom1;
				}
			}else {
				if(denom1 % denom2 == 0) {
					arr[1] = denom1;
					arr[0] = (denom1 / denom2) * numer2 + numer1;
				}else {
					arr[1] = (denom1 * denom2 / gcd(denom1, denom2));
					int a = 0, b = 0;
					a = (arr[1] / denom1) * numer1;
					b = (arr[1] / denom2) * numer2;
					arr[0] = a+b;
				}
			}
	        if(arr[1] % arr[0] == 0) {
				arr[1] = arr[1] / arr[0];
				arr[0] = 1;
	        }
	        return arr;
	    }
	    
	    public static int gcd(int a, int b) {
			if (a % b == 0) {
	            return b;
	        }
	        return gcd(b, a%b);
		}
	 */
}