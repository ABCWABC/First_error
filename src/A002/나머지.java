package A002;

import java.util.Scanner;

public class 나머지 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(2<=a && a<=10000) {
			if(2<=b && b<=10000) {
				if(2<=c && c<=10000) {
					System.out.println((a+b)%c);
					System.out.println(((a%c)+(b%c))%c);
					System.out.println((a*b)%c);
					System.out.println(((a%c)*(b%c))%c);
				}
			}
		}
	}
}
