package day6;

/*
1)Declare an Array
2)Add value into an Array
3)Find size of Array
4)Read Single value from Array
5)Read Multiple Value from Array
*/

public class TwoDimenstionalArray {

	public static void main(String[] args) {

		// Approach 1 : Declare an array
		
		
				/*
				int a[][]=new int[3][2];
				
				//int [][]a=new int[3][2]; we can declare an array list this also
				//int []a[]=new int[3][2];
				
				a[0][0]=100;
				a[0][1]=200;
				
				a[1][0]=300;
				a[1][1]=400;
				
				a[2][0]=500;
				a[2][1]=600;
				
				*/
				
		// Approach 2: for Declare an array
				
				int a[][]= {  {100,200},{300,400},{500,600}  };
				
		// 3)Find size of Array
				{
				
				System.out.println("Length of row:"+a.length);
				System.out.println("Length of colume:"+a[0].length);
	
				}
		// 4)Read Single value from Array
				
				System.out.println(a[1][1]);
				System.err.println(a[2][1]);
		
			// 5)Read Multiple Value from Array
				
				// Approach 1: using for loop
				
				for (int r=0;r<=2;r++)
				{
					for(int c=0;c<=1;c++)
					{
						System.out.println(a[r][c]+"  ");
						
					}
					System.out.println();
					
					// Approach 2: using enhanced for loop
					
					for(int arr[]:a)
					{
						for (int x:arr)
						{
							System.out.println(x+"  ");
						}
						System.out.println();
							
					}
				}

				
			
		
	}

}
