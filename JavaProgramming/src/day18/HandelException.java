package day18;

import java.util.Scanner;

public class HandelException {

	public static void main(String[] args) {
		
		System.out.println("Program is started...");
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter your num:");
		int num=sc.nextInt();
		
		try
		{
		
		System.out.println(100/num);  //this will through ArithmeticException
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid data");
		}
		System.out.println("Programmer is completed");
		
		System.out.println("Programmer is exited..");
		
		
		
		
		

	}

}
