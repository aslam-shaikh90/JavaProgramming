package day6;

public class ObjectArray {

	public static void main(String[] args) {
		
		Object a[]= {100,10.10,'a',"Welcome",true};
		
		// Approach 1 printing data from array

		
		for(Object x:a)
		{
			System.out.println(x);
		}
		
		
		// Approach 2 printing data from array
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}

	}

}
