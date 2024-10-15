package day7;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {
		
		// char s[]={'A','D','C','E','F','B','G'};
		
		String s[]= {"Aslam","Rahul","Bapu","Daya"};
		
		System.out.println("Befor sortig the Arrys...."+Arrays.toString(s));
		
		Arrays.sort(s);
		
		System.out.println("After sortig the Arrys...."+Arrays.toString(s));


	}

}
