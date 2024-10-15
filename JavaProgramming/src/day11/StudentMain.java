package day11;

public class StudentMain {

	public static void main(String[] args) {
		
		// Objects
		
		// Student stu=new Student();
		
		// Approach 1: For calling Object by using object reference variables
		
		
		/*
		stu.sid=101;
		stu.sname="aslam";
		stu.grad='A';
		
		*/
		
		
		// Approachv2: Using Method
		
		//stu.setStudentData(101, "aslam", 'A');
		
		//stu.printStudentData();
		
		// Approach :3) Using Constructor
		
		Student stu=new Student(101,"Aslam",'A');
		stu.printStudentData();
		
	}
				

}
