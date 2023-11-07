package java_ex100;

import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		System.out.print("입력하세요.");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		System.out.print((char)n);
		
		scan.close();
	}

}
