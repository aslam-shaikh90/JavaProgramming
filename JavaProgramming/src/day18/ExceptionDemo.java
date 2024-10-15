package day18;

import java.util.Scanner;

public class ExceptionDemo {

	
	public static void main(String[] args) {
		
		System.out.println("Program is started...");
		
		Scanner sc=new Scanner(System.in);
		
		//Exmple 1:
		/*
		System.out.println("Enter your num:");
		int num=sc.nextInt();
		
		System.out.println(100/num);  //this will through ArithmeticException
		
		
		*/
		
		//Example2:
		/*
		
		
		int a[]=new int[5];
		System.out.println("Enter the position(0-4):");
		
		int pos=sc.nextInt();
		
		System.out.println("Enter the value");
		
		int value=sc.nextInt();
		
		a[pos]=value;    
		
		System.out.println(a[pos]); // ArrayIndexOutOfBoundsException
		
		*/
		
		
		//Example 3:
		
		String s="welcome";
		
		int num=Integer.parseInt(s);  
		System.out.println(num); //NumberFormatException
		
		
			
		// Example 4:
		
		String ss=null;
		
		System.out.println(ss.length());  //NullPointerException
		
		System.out.println("Programmer is completed");
		
		System.out.println("Programmer is exited..");
		
	}

}
