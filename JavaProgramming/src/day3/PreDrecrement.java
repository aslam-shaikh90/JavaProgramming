package day3;

public class PreDrecrement {

	public static void main(String[] args)
	{
		int a=10;
		
		a--;
		System.out.println(a);  //9
		
		//Case 1
		
		int b=100;
		
		int res=b--;
		System.out.println(res); //100
		System.out.println(b);  //99
	
		//case 2
		
		int c=100;
		
		int res1=--c;
		
		
		System.out.println(res1); // 99
		System.out.println(c);   //99 	
			
		
		
		
	}

}
