package day17;

public class DataConversionMethoid {

	public static void main(String[] args) {
		
		// String to int conversion
		
		// String s="welcome";  // this type of data we con not convert in to int
		
		String s="1234";
		
		int sint=Integer.parseInt(s);
		
		System.out.println(sint);
		
		// Example 1:
		
		String s1="20";
		String s2="30";
		
		int sum=Integer.parseInt(s1)+Integer.parseInt(s2); // like that we can convert String into int
		
		System.out.println(sum);

		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		// String to double
		
		String s3="10.10";
		String s4="12.12";
		
		System.out.println(Double.parseDouble(s3)+ Double.parseDouble(s4));
		
		// String to Boolean
		
		String s5="welcome"; // other than true if you pass any string that will return false
		
		System.out.println(Boolean.parseBoolean(s5));
		
		
		// String to Char is  not possible
		
		
		// int double boolean char into String conversion
		
		
		int a=10;
		double d=22.2;
		char c='a';
		boolean bool=true;
		
		
		String ss=String.valueOf(a);
		System.out.println(ss);
		
		String dd=String.valueOf(d);
		System.out.println(dd);
		
		String cc=String.valueOf(c);
		System.out.println(cc);
		
		String bb=String.valueOf(bool);
		System.out.println(bb);
		
		
		
	}

}
