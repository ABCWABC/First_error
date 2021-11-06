package A002;

// 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), 
//  A%B(나머지)를 출력하는 프로그램을 작성하시오.
// 

import java.util.Scanner;

public class 사칙연산 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if(a>=1 && a<=10000) {
			if(b>=1 && b<=10000) {
				System.out.println(a+b);
				System.out.println(a-b);
				System.out.println(a*b);
				System.out.println(a/b);
				System.out.println(a%b);
			}
		}
	}

}
