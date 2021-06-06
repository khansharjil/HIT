package mypack;

import java.util.Scanner;

public class quotient {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
		System.out.println("enter number");
		int x=scan.nextInt();
				System.out.println("enter number");
		int y=scan.nextInt();
		System.out.println("the quotient is "+(x/y));
		System.out.println("the remainder is "+(x%y));
		}
		
		
	}
}
