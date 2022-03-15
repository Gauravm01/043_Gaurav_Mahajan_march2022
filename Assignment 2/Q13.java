/*
13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
*/

import java.util.Scanner;

class Q13{
	public static void main(String args[]){
		double width = 5.6f, height = 8.5f;
		double area = width * height;
		double perimeter = 2*(width + height);
		System.out.println("Area is "+width+" * "+height+" = "+area);
		System.out.println("Perimeter is 2 * ("+width+" + "+height+") = "+perimeter);
	}
}