package day3;

public class TernaryOperator {

	public static void main(String[] args) 
	{
	
		// Statement variable=exp.? Result:1 Result2;
		
		//Example 1
		
		/*
		 int a=200, b=100;
		 
		
		int x= (a<b)? a: b;
		
		System.out.println(x);
		
		*/
		
		// Example 2
		
		int x=(1==1) ? 200: 100;
		System.out.println(x);
		
	
		int y=(1==2) ? 200: 100;
		
		System.out.println(y);
		
		
		// Example 3
		
		
				
		int person_age=10;
		
		String res=(person_age>18)? "Eligible": "not Eligible";
		System.out.println(res);
		
		
	}

}
 