//Write a Java Program to find the Factorial of given number.

import java.util.*;
class Q2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int fact = 1;
		for(int i =1; i <= num; i++){
			fact *= i;
		}
		System.out.println("Factorial of given number is :"+fact);
	}
}