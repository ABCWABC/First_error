package A002;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class AmultipleB2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if(a>0 && a<10) {
			if(b>0 && b<10) {
				System.out.println(a*b);
			}
		}
	}

}
