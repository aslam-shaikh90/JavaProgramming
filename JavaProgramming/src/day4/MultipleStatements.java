package day4;

public class MultipleStatements {

	public static void main(String[] args)
	{
	// Example 1
		
	
		if(true)
			
		{
			System.out.println(1);
	
		}
		else
		{
			System.out.println(2);
		}
	
		
		// Example 2
		
		if(1==4)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(2);
		} 
		
		// Example 3
		
		if(true)
		{
			if(false)
			
			
			{
				System.out.println("abc");
			}
			else
			{
				System.out.println("xyz");
			}
		}
		else 
		{
			System.out.println("a");
		}
	}

}
