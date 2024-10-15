package day5;

public class ForLoop {

	public static void main(String[] args) {
		
		// Exam. 1 Printing 1  ...... 10 number
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		
		// Exam. 2: Printing 1  ...... 10 number
		
				for(int a=2;a<=10;a+=2)
				{
					System.out.println(a);
				}
				
		// Exam 3: 
				
				for (int c=1;c<=10;c++)
				{
					if(c%2==0)
					{
						System.out.println(c+"even number");
					}
					else
					{
						System.out.println(c+"odd number");
				
					}
				}

				// Example 3: 10......1 number printing 
				
				for(int s=10;s>=0;s--)
				{
					System.out.println(s);
					s--;
					
				}
	}

}
