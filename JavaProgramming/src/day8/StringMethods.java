package day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		// String s="welcome"; // Approach 1: for create String variable
		//String s=new String("welcome"); Approach 2: for create String variable
		 
		// System.out.println(s);
		
		// Methods 1: length ()  Return length of string (Number of character)
		
		
			String s="welcome";
			s.length();
			System.out.println(s.length()); // 7   Approach 1
			System.out.println("welcome".length()); // 7 Approach 2
			
			
			// Methods 2: concat() we can joining two or multiple string
			
			String s1="Welcome";
			String s2="to jave";
			String s3="Automation";
			
			
			// Connecting two string
			
			System.out.println(s1+s2); //Welcometo jave
			System.out.println(s1.concat(s2)); //Welcometo jave
			
			// Connecting 3 String
			
			System.out.println(s1+s2+s3); //Welcometo javeAutomation
			System.out.println(s1.concat(s2+s3)); //Welcometo javeAutomation
			
			// Connecting direct String
			
			System.out.println("welcom"+"to jave");// welcomto jave
			System.out.println("Welcome".concat("to jave")); //Welcometo jave
			
			
			
			// Method 3: trim()  Remove space for left and right side
			
			s="  welcome   ";
					
			System.out.println(s);
			System.out.println("Before triming:"+s.length());  // 12
			
			System.out.println(s.trim());
			System.out.println("After triming:"+s.trim().length()); //7
			
			
			// Method 4: CharAt() - Return a character from a string based on index
			
			s="welcome";
			
			System.out.println(s.charAt(3));  //c
			System.out.println(s.charAt(0)); // w
			
			
			// Method 5: contains() Returns true or false
			// Check string is part of main string or not
			
			s="welcome";
			
			System.out.println(s.contains("wel"));  // true
			System.out.println(s.contains("come"));  // true
			System.out.println(s.contains("Wel")); // false
			
					
			// Method 6: equals()  equalsIngonreCase()  Compare String
			
			s1="welcome";
			s2="welcome";
			
			System.out.println(s1==s2);  //true
			System.out.println(s1.equals(s2)); //true
			
			System.out.println(s1.equals("Welcome")); //false
			System.out.println(s1.equalsIgnoreCase("Welcome")); //true
			
			
			// Method 7: replace()  - Replace single/multiple (sequence) of character in a string
			
			s="Welcoem to selenium jave selenium python selenium c#";
			System.out.println(s.replace('e', 'E')); //WElcoEm to sElEnium javE sElEnium python sElEnium c#

			
			System.out.println(s.replace("selenium", "Hello"));  // Welcoem to Hello jave Hello python Hello c#

			// Method 8: substrings() -- extract substring from the main string
			
			// Starting index -0
			// Ending index - 1
			
			s="Selenium";
			System.out.println(s.substring(1,5));  //elen
			System.out.println(s.substring(0,3));   // Sel
			
			//Method 9: toUpperCase() toLowerCase()
			
			
			s="welcome";
			
			System.out.println(s.toUpperCase());  //WELCOME
			System.out.println(s.toLowerCase());  //welcome
			
			// Method 9: split() - split the string into multiple parts based on delimiter
			
			s="abc@gmail.com";
			
			String a[]=s.split("@");
			
			System.out.println(Arrays.toString(a)); //[abc, gmail.com]
			System.out.println(Arrays.toString(s.split("@")));  //[abc, gmail.com]


			System.out.println(a[0]); //abc
			System.out.println(a[1]);  //gmail.com
			
			// Example 1: 
			
			String amount="$15,10,11";
			System.out.println(amount.replace("$",""));   //15,10,11
			System.out.println(amount.replace("$","").replace(",",""));  //151011
			
			
			// Example 2: 
			s="abc,123@xyz";
			
			String arr1[]=s.split(",");
			System.out.println(Arrays.toString(arr1));  //[abc, 123@xyz]
			 
			String arr2[]=arr1[1].split("@");
			System.out.println(Arrays.toString(arr2));  //[123, xyz]
			
			System.out.println(arr1[0]);  //abc
			System.out.println(arr2[0]);  //123
			System.out.println(arr2[1]);  // xyz
			
			
			// Example 3:  Split string by use space delimiter (we can not use this delimiters * & % ^ ()  )
			
			s="abc 123 xyz";
			
			String ar[]=s.split(" ");
			System.out.println(Arrays.toString(ar));  //[abc, 123, xyz]

			
			// Example 4: 

			String name="Aslam Shaikh";
			
			System.out.println(name.replace('A','a').contains("aslam"));  //true
			
			System.out.println(name.toLowerCase().contains("aslam"));	// true			

			

			

			
			
 			

			
				
			
			

					
			
	}

}
