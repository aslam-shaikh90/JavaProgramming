package day11;

public class ConstructorDemo {
	
	//Constructor 
	
	int x;
	int y;
	
	ConstructorDemo()  // Default Constructor
	{
		x=100;
		y=200;
	}
	
	ConstructorDemo(int a,int b) //Parameterized Constructor
	{
		x=a;
		y=b;
	}
	void sum()
	{
		System.out.println(x+y);
	}
	

	public static void main(String[] args) 
	{
		// ConstructorDemo cd=new ConstructorDemo(); // invoke default constructor
		
		ConstructorDemo cd=new ConstructorDemo(10,30); // Parameterized constructor

		cd.sum();  //300 
				
		
		
		
		
		
		

	}

}
