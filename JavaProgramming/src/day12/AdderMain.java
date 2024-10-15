package day12;

public class AdderMain {
	
	public static void main(String[] args) {
		
		Adder addobj=new Adder();
		
		addobj.sum(); //called 1 methods
		
		addobj.sum(10.3, 10);  // Called 4 methods
		
		addobj.sum(11, 1.1);  //3
		
		addobj.sum(22, 22);  //2
				
	
	
	
	
	}
}
