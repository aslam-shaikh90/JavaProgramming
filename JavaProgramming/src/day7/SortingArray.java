package day7;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		
		int a[]= {100,400,600,200,300,500,100};
		
		System.out.println("Before shorting Array...");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);  // Sort element in arrays
		
		System.out.println("After shorting Array..");
		System.out.println(Arrays.toString(a));

	}

}
