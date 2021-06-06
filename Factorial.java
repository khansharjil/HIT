package mypack;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your Number :");
	int num=scan.nextInt();
	int factorial=fact(num);
	System.out.println("Factorial of Entered number is :"+factorial);
}
static int fact (int n)
{
	int output;
	if (n==1);
	{
		return 1;
	}
	output = fact(n-1)*n;
	return output;
}
}
