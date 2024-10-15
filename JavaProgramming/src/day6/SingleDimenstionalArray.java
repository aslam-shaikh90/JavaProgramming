package day6;

public class SingleDimenstionalArray {
	
	/*
	1)Declare an Array
	2)Add value into an Array
	3)Find size of Array
	4)Read Single value from Array
	5)Read Multiple Value from Array
*/

	public static void main(String[] args) {
		
		// Approach 1 : Declare an array
		
		
		/*
		int a[]=new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		a[5]=600;
		
		*/
		
		
		// Approach 2: for Declaring an Array
		
		int a[]= {100,200,300,400,500};
		
		// Find length of an array
		
		System.out.println("Length of an Array:"+  a.length);
		 
		// 	4)Read Single value from Array
		System.out.println(a[4]);
		
		
		// 	5)Read Multiple Value from Array
		
		// Approach 1: Normal for loop
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

		// Approach 2: enhanced for loop
		
		for(int x:a)
		{
			System.out.println(x);
		}
	}

}
