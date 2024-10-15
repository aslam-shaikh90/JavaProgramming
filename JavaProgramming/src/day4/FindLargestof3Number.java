package day4;


/*
 a>b and b>c   -- a is largest number
 b>a and b>c   -- b is largest number
 c>a and c>b   -- c is largest number
 */
public class FindLargestof3Number {

	public static void main(String[] args)
	{
		int a=100,b=2000,c=3000;
		
		if (a>b && b>c)
		{
			System.out.println("a is largest number:"+ a);
		
		}
			
		else if (b>a && b>c)
		{
			System.out.println("b is largest number:"+  b);
		}
		
		else
		{
			System.out.println("C is largest number:"+ c);
		}

	}

}
