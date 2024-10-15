package day3;

public class OperatorsDemo {

	public static void main(String[] args)
	{
		// 1) Arithmetic operators (+-*%/)
		
		int a=100, b=200;
		System.out.println("This is a sum of a+b:"+(a+b));
		System.out.println("This is a sub of a+b:"+(a-b));
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a*b);
		
		
		// 2)Relational/comparison operators (> >= < <= != ==)
		// Returns boolean value - true or false
		
		int d=10,c=15;
		
		System.out.println(d>c);
		System.out.println(d<c);
		System.out.println(d<=c);
		System.out.println(d>=c);
		System.out.println(d!=c);
		System.out.println(d==c);
		
		
		//3) Logical Operators  (&&  ||  =!)
		// return boolean value - true or false.
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!y);
		System.out.println(!x);
		

	}

}

 