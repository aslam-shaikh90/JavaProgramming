package day14;

// single Inheritance  

class A
{
	int a=10;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A
{
	int b=200;
	void show()
	{
		System.out.println(b);
	}
}

public class InheritanceTypes {

	public static void main(String[] args) {
		
		B bObj=new B();
		System.out.println(bObj.a);
		System.out.println(bObj.b);
		
			bObj.display();
			bObj.show();
			
			


	}

}
