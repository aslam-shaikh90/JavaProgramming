package day9;

public class ReverseAString {

	public static void main(String[] args) {
		
		// Approach 1: by using length() and chaAt() methods
		
		String s="welcome";
		String rev=" ";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
						
		}
		System.out.println("Reverse string is:"+rev);// emoclew
		
		
		// Approach 2: by converting string to char array type
		
		String s1="welcome";
		String revs="";
		
		char a[]=s.toCharArray();
		
		for(int i=a.length-1;i>=0;i--)
		{
			revs=revs+a[i];
		}
			System.out.println("Revers Striing is:"+revs); // emoclew
			
			
			//Approach 3: using StringBuffer Class
			
			StringBuffer s3=new StringBuffer("welcome");
			System.out.println("Revers String is:"+s3.reverse());  //emoclew
			
			//Approach 3: using StringBuilder Class
			
			StringBuilder s4=new StringBuilder("welcome");
			System.out.println("Revers String is:"+s4.reverse());  //emoclew
			
			
			
			
			
			
				

	}

}
