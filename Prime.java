package mypack;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
int temp;
boolean isPrime=true;
Scanner scan=new Scanner(System.in);
System.out.println("Enter Number :");
int num=scan.nextInt();
scan.close();
for (int i=2;i<=num/2;i++)
{
	temp=num%i;
	if (temp==0)
	{
		isPrime=false;
		break;
	}
}
if (isPrime)
	System.out.println(num+"Number is Prime");
else
	System.out.println(num+"Number is not a Prime");


}
}
