package day13;

public class ThisKeyword {
	
	int x,y;    // class variables// instantance variables
	
	/* ThisKeyword (int x,int y)
	{
		this.x=x;
		this.x=y;
	}
	*/
	void setData(int x,int y)
	{
		this.x=x;
		this.x=y;
		
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		
		// ThisKeyword th=new ThisKeyword(100,200);
		
		
		ThisKeyword th=new ThisKeyword();
		th.setData(100,200);
		th.display();
					
		
	}	

}
