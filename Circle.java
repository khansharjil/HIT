package mypack;

import java.util.Scanner;

public class Circle {
 static Scanner sc=new Scanner(System.in);
 public static void main(String[] args) {
	System.out.println("Enter Radius of Circle :");
	double radius=sc.nextDouble();
	double area=Math.PI*(radius*radius);
	System.out.println("Area of circle is :"+area);
	double circumference=Math.PI*2*radius;
	System.out.println("The circumference of Circle is :"+circumference);
	
}
}
