package day15;

class test
{
	final int x=100;
}

public class FinalKeyword {

	public static void main(String[] args) {
		
		test t=new test();
		
		// t.x=200;  //  incorrect boz x int is final virable
		
			System.out.println(t.x);

	}

}
