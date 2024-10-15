package day14;

class AA
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class BB extends AA
{
	int b;
	void show()
	{
		System.out.println(b);
	}
}

class C extends BB
{
	int c;
	void print() 
	{
		System.out.println(c);	
	}
}

public class MulilevelInheritance {

	public static void main(String[] args) {
		
		C cobj=new C();
		
		cobj.a=100;
		cobj.c=200;
		cobj.b=300;
		
		cobj.show();
		cobj.print();
		cobj.display();
		
	

	}

}
