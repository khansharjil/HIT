package mypack;

import java.util.Scanner;

public class even_od {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
		System.out.println("Enter number ");
		int x=scan.nextInt();
		if(x%2==0)
		System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
		
	}
	}
}
