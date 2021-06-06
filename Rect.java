package mypack;

import java.util.Scanner;

public class Rect {
public static void main(String[] args) {
	 	Scanner scanner=new Scanner(System.in);
System.out.println("Enter length of Rectangle :");
double length=scanner.nextDouble();
	System.out.println("Enter width of Rectangle :");
	double width=scanner.nextDouble();
	double area=length*width;
	System.out.println("area of Rectangle is :"+area);
}
}
