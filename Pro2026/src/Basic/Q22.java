package Basic;

import java.util.Scanner;

/*
	< 직각삼각형 출력하기 >
	
	✔️결과 : +1
		
	"*"의 높이와 너비를 1이라고 했을 때, "*"을 이용해 직각 이등변 삼각형을 그리려고합니다.
	정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.
	
	
	제한사항)
	1 ≤ n ≤ 10
*/

public class Q22 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
        	StringBuilder sb = new StringBuilder();
        	for(int j = 1; j <= i; j++) {
            	sb.append("*");
            }
        	System.out.println(sb);
        }
    }
	
	//★ 코테/실무 호환성까지 생각하면 내 코드가 더 안전한 정석
	
	//내 코드 개선
	/*
		for (int i = 1; i <= n; i++) {
		    StringBuilder sb = new StringBuilder(i); //길이 예상
		    for (int j = 0; j < i; j++) sb.append('*'); //j 루프는 0부터 시작
		    System.out.println(sb);
		}
	*/

	
	// 다른분 풀이 (깔끔)
	/*
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("*".repeat(i));
        }
    */
}