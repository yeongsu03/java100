package java_ex100;

import java.util.Scanner;

public class ex14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시를 입력하세요>");
		int h = scan.nextInt();
		
		System.out.print("분을 입력하세요>");
		int m = scan.nextInt();
	
		System.out.print(h+":"+m);
	
		scan.close();
	}
}
