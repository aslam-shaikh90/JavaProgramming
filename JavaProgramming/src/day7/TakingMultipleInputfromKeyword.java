package day7;

import java.util.Scanner;

public class TakingMultipleInputfromKeyword {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		
		// Example 1:
		
		System.out.println("Enter Your First Number:");
		int num1=sc.nextInt();
		
		System.out.println("Enter Your second Number:");
		int num2=sc.nextInt();
		
		System.out.println("Addtion of Two Number:"+(num1+num2));
		
		// Example 2:
		
		System.out.println("Enter Your Name");
		String name=sc.next();
		System.out.println("your name is:"+ name);
		
		System.out.println("Enter Your Age");
		int age=sc.nextInt();
		System.out.println("Your age is:"+age);
		
		
				
		
		
		
	}

}
