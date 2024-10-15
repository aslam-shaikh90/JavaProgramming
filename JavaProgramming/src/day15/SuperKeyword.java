package day15;

class animal
{
	String color="white";
}

class dog extends animal
{
	String color="black";
	
	void displayColor()
	{
		System.out.println(super.color);  //super keyword will be invoke the immedite parent variabe
		
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		
		dog d=new dog();
		d.displayColor();
		

	}

}
