package java_ex100;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("몇 년인가요? ");
		int year = scan.nextInt();

		System.out.print("몇 년인가요? ");
		int mon = scan.nextInt();

		System.out.print("몇 년인가요? ");
		int day = scan.nextInt();
		
		System.out.printf("%d", year);
		System.out.printf(".");
		System.out.printf("%d", mon);
		System.out.printf(".");
		System.out.printf("%d", day);

		
		scan.close();
		

	}

}
