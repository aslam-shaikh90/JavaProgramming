package day7;

public class FindDuplicatesValuesinArray {

	public static void main(String[] args) {
		
		int a[]= {100,200,300,100,100,100};
		int num=300;
		int count=0;
		
		for(int value:a)
		{
			if(value==num)
			{
				count++;
			}
		
		}
		
		
			System.out.println(count);}
		

	}


