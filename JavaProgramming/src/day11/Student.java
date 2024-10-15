package day11;

public class Student {
	
	// Variables
	
	int sid;
	String sname;
	char grad;
	
	// Methods 1
	
	void printStudentData()
	{
		System.out.println(sid+"  "+sname+"  "+grad);
	}
	
	//Methods 2:
	
	void setStudentData(int id,String name,char gr)
	{
		sid=id;
		sname=name;
		grad=gr;
				
	}
	
	// Constructor
	
	Student(int id,String name,char gr)
	{
		sid=id;
		sname=name;
		grad=gr;
			
	}
	

}
