package day9;

public class StringComparison {

	public static void main(String[] args) {
		
		// Case 1:
		
		String s1="welcome";
		String s2="welcome";
		
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));  //true
		
		//Case 2
		
		String s3=new String("welcome");
		String s4=new String("welcome");
		
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println(s3==s4);//false compare object only
		System.out.println(s3.equals(s4)); // true compare value of object
		
		// Case :3
		
		String s5="welcome";
		String s6=new String("welcome");
		String s7=s6;
		
		
		System.out.println(s5==s6);  //false
		System.out.println(s5.equals(s6)); //true
		
		System.out.println(s6==s7); //true  Bcoz object are same
		System.out.println(s6.equals(s7)); //true
		
		System.out.println(s5==s7); //false to compare object only
		System.out.println(s1.equals(s7)); //true compare value of object.
		
		
		
		
		
		
	}

}
