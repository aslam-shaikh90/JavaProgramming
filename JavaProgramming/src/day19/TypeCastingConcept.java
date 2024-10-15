package day19;

// UPcasting-- Converting value from smaller -to larger
		
//1) int -----> longe
// 2) double ---> float

// Downcastin --  Converting value from larger to smaller

// 1) longe ---> int

// 2) float----> double

public class TypeCastingConcept {

	public static void main(String[] args) {
		
		
		// Upcasting automatic  smaller to larger
		
		int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);
		
		
		float floatvalue=10.5f;
		double doublevalue=floatvalue;
		
		System.out.println(doublevalue);
		
		
		// DownCastting manually  ---- larger to smaller
		
		
		long longvalue1=10000;
		int intvalue1=(int)longvalue1;
		
		System.out.println(intvalue1);
		
		
		double doublevalue1=123123.33;
		float floatvalue1=(float)doublevalue1;
		
		System.out.println(floatvalue1);
		
		// Example
		
		int i=100;
		double d=i; // upcasting 
		
		System.out.println(d); //100.o
		
		// Example 2
		
		double dd=10.5;
		int ii=(int)dd;  //downcasting
		
		System.out.println(ii);
		

	}

}
