package day7;

public class SerchingElementInArray {

	public static void main(String[] args) {
		
		// Approach 1: using for loop
		
		int a[]= {10,20,30,40,50};
		int serch_element=30;
		
		boolean status=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==serch_element)
			{
				System.out.println("Element Found");
				status=true;
				break;
			}
				
		}
		if (status==false)
		{
			System.out.println("element not found");
		}
		
		
		// Approach 2: using enhanced loop
		
		for(int x:a)
		{
			if(x==serch_element)
			{	
			System.out.println("Element Found");
			status=true;
			break;
		}
			
	}
	if (status==false)
	{
		System.out.println("element not found");
	}
	
	
		

	}

}
