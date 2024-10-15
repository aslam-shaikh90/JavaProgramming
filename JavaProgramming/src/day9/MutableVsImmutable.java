package day9;

import java.util.Arrays;

public class MutableVsImmutable {
	
	
	public static void main(String[] args) {
		
		// Mutable -- can change the value
		
		
		int a[]= {30,10,40,20,50};
		
		System.out.println("Before sorting as Arrays:"+Arrays.toString(a)); // [30, 10, 40, 20, 50]

		
		Arrays.sort(a);
		
		
		System.out.println("After sorting an Arryas:"+Arrays.toString(a));  //[10, 20, 30, 40, 50]
		
		// Immutable -- can not change the value
		
		String s=new String("Welcome");
		
		System.out.println(s); //Welcome
		
		String concatString=s.concat("to jave");
		
		System.out.println(s); //Welcome ----> immutable can not change the value
		
		System.out.println(concatString);
		
	}

}
