package java_ex100;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char c = str.charAt(0);
		int num = c;
		System.out.print(num);

		scan.close();
	}

}
