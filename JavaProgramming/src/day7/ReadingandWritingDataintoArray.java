package day7;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingandWritingDataintoArray {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		
		Scanner sc=new Scanner (System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the value for the position"+i+":");
			a[i]=sc.nextInt();
			
		}
		System.out.println("Printing array Element ");
		System.out.println(Arrays.toString(a));
		

	}

}
