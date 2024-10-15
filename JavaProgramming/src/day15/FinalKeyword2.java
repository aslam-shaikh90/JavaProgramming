package day15;

class test1 // when you apply final keyword to the class you can not extends in child class
{
	final void m()  //// when you apply final keyword to the method you can not override in child class
	{
		System.out.println("this is m method from test1");
	}
}


class test2 extends test1
{
	// void m()  // incorrect boz m method is final method
	{
		System.out.println("this is m method from test2");
	}
}
public class FinalKeyword2 {

	public static void main(String[] args) {

	}

}
