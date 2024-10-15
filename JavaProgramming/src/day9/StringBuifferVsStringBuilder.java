package day9;

public class StringBuifferVsStringBuilder {

	public static void main(String[] args) {
		
		
		//StringBuffer mutable
		
		StringBuffer s=new StringBuffer("Welcome");
		s.append("to Java");
		System.out.println(s); // Welcometo Java we can change the original string value
		
		
		StringBuilder s1=new StringBuilder("welcome");
		s1.append("to Java");
		System.out.println(s1);// welcometo Java we can change the original value
		
			


	
		
		

	}

}
