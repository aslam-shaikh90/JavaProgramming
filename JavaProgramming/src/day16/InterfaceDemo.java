package day16;

interface shape
{
	int lenght=10; //final and static
	int width=20;  // final and static
	
	void circle();  //abstrac method
	
	default void square()
	{
		System.out.println("this is square -- default method");
	}
	
	static void rectangle()
	{
		System.out.println("this is rectangle --- satic method");
	}
	
	
}

public class InterfaceDemo implements shape
{	
	public void circle()
	{
		System.out.println("this is circle --- abstrac method");
	}
	public static void main(String[] args) {
		
		/*		
		Scenario 1:
		
		InterfaceDemo idobj=new InterfaceDemo();
		
		idobj.circle();  // abstract
		idobj.square(); // default
		
		shape.rectangle();  // static method can directly access from interface
		*/
		
		
		// Scenario 2:
		
		shape sh=new InterfaceDemo();
		
		sh.circle();   //abstract
		sh.square();  //default
		
		shape.rectangle();  //static method can directly access from interface
		
		System.out.println(shape.lenght * shape.width); // accessign static variables dirctly 
		
		
	}

}
