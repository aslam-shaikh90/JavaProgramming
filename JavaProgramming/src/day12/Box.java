package day12;

public class Box {
	
	double width,hight,depth;
	
	// Constructor 1 
	
	Box() 
	{
		width=hight=depth=0;
	}
	
	// Constructor 2
	
	Box(double w,double h,double d)
	{
		width=w;
		hight=h;
		depth=d;
		
	}
	
	// Constructor 3
	
	Box(double len)
	{
		width=hight=depth=len;
	}
	
	// Constructor 4
	
	double valum()
	{
		return(width*hight*depth);
	}
	

}
