package day18;

public class CheckedException {

	public static void main(String[] args) {
		
		System.out.println("Program Started.....");
		System.out.println("Program in Progres....");
		try
		{
		Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("Program finished.......");
		System.out.println("Pgogram is exited.....");

	}

}
