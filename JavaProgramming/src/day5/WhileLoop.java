package day5;

public class WhileLoop {

	public static void main(String[] args) {
		
		// Example 1: Printing 1... 10 number..
		
		int i=1;    //Initialization
		
		while (i<10)  // Condition
		{
			System.out.println(i);
			i++;   // inc.
		}

		
		// Example 3: Printing Even Number from 1 to 10 number..
		
				int b=2;    //Initialization
				
				while (b<10)  // Condition
				{
					System.out.println(b);
					b+=2;   // inc.
				}
				
				// Approach 2 for printing even number
				
				int c=2;
				while(c<=10)
				{
					if(c%2==0)
					{
						System.out.println(c);
					}
					c++;
				}
				
				// Example 2: Printing Hello  10 number..
				
				int h=1;    //Initialization
				
				while (h<10)  // Condition
				{
					System.out.println("Hello");
					h++;   // inc.
				}
				
				// Example 4 Printing the even and odd number ...
				
				int d=1;
				
				while (d<=10)
				{
					if (d%2==0)
					{
						System.out.println(d+"even number");
					}
					else
						System.out.println(d+"odd number");
					d++;
		
				}
				
				// Example 5: Printing 10 .......1 number
				
				int f=10;
				
				while(f>=0)
				{
					System.out.println(f);
					f--;
				}

	}

}
