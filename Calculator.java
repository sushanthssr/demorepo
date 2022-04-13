package com.wipro.calculator;
import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int numberOne,numbertwo;
		System.out.println("enter 1 number");
		numberOne=scan.nextInt();
		System.out.println("enter 2 number");
		numbertwo=scan.nextInt();
		int result=numberOne+numbertwo;
		System.out.println(result);
		
		System.out.println("Welcome to Stackroute");
		
	}

}
