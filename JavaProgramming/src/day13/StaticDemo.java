package day13;

public class StaticDemo {
	
	static int a=10;    // this is a static variable
	
	int b=20;  // This is non static variable
	
	
	static void m1()    // This is a static methods
	{
		System.out.println("this is a static methods......");
	}
	
	void m2()    // This is a non static methods
	{
		System.out.println("This is non static methods.....");
	}
	
	void m()  // this is non static method....
	{
		System.out.println(a);
		System.out.println(b);
		
		m1();
		m2();
	}

	public static void main(String[] args) {
		
		// 1) static methods can access stuff directly (object)
		
		System.out.println(a);
		m1();
		
		
		// 1) Static methods can access non static stuff through object.
		
		StaticDemo sd=new StaticDemo();
		System.out.println(sd.b);
		sd.m2();
		
	
		
		

	}

}
