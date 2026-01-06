package Basic;

import java.util.*;

/*
	< 최빈값 구하기 >
		
	최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
	정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
	최빈값이 여러 개면 -1을 return 합니다.
	
	
	제한사항)
	0 < array의 길이 < 100
	0 ≤ array의 원소 < 1000
*/

public class Q11 {
	public int solution(int[] array) { //문제는 풀었지만, 실전 코테에서는 감점 위험이 높은 풀이 (불필요한 String 조작, 상태 변수가 많고 로직이 꼬여 있음)
        int answer = 0;
		int cnt  = 1;
		String data = "";
		
		if(array.length == 1) {
			answer = array[0];
		}else {
			Map<Integer,Integer> map = new HashMap<Integer,Integer>();
			for(int i = 0; i < array.length; i++) {
				if(map.containsKey(array[i])) {
					map.put(array[i], map.get(array[i])+1);
					if(cnt < map.get(array[i])) {
						cnt = map.get(array[i]);
						data = String.valueOf(array[i]);
					}else if(cnt == map.get(array[i])) {
						data = data + ","+String.valueOf(array[i]);
					}
				}else {
					map.put(array[i], 1);
				}
			}
			answer = cnt == 1 ? -1 : (data.contains(",") ? -1 : Integer.parseInt(data));
		}
        return answer;
    }
	
	// 다른분 풀이 >> 가장 좋은 풀이
	/*
		public int solution(int[] array) {
	        int maxCount = 0;
	        int answer = 0;
	        Map<Integer, Integer> map = new HashMap<>();
	        for(int number : array){
	            int count = map.getOrDefault(number, 0) + 1;
	            if(count > maxCount){
	                maxCount = count;
	                answer = number;
	            }else if(count == maxCount){
					answer = -1;
	            }
	            map.put(number, count);
	        }
	        return answer;
	    }
    */
	
	// 기존 풀이
	/*
		public int solution(int[] array) {
	        int answer = 0;
	        if(array.length == 1) {
				answer = array[0];
			}else {
				Map<Integer,Integer> map = new HashMap<Integer,Integer>();
				for(int i = 0; i < array.length; i++) {
					if(map.containsKey(array[i])) {
						map.put(array[i], map.get(array[i])+1);
					}else {
						map.put(array[i], 1);
					}
				}
				Set<Integer> keys = map.keySet();
				int temp = 0;
				int count = 0;
				for(int key : keys) {
					if(map.get(key) > temp) {
						answer = key;
						temp = map.get(key);
						count = 0;
					}else if(map.get(key) == temp) {
						count++;
					}
				}
				answer = count > 0 ? -1 : answer;
			}
	        return answer;
	    }
	 */
}