package mypack;

import java.util.Scanner;

public class Triangle {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter width of Triangle :");
	double width=scan.nextDouble();
	System.out.println("Enter height of Triangle :");
	double height=scan.nextDouble();
	double area=(width*height)/2;
	System.out.println("Area of a Rectangle :"+area);
	
}
}
