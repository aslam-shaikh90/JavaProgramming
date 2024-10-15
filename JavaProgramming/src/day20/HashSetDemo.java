package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		
		// Declaration
		
		HashSet myset=new HashSet();
		
		// Set myset=new HashSet();
		
		
		// 	HashSet<Sting> myset=new HashSet<String>();
		
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add('A');
		myset.add(true);
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		
		// Printing Hashset data
		
		System.out.println(myset);  // [null, A, 100, 10.5, welcome, true]
		
		// Remoing element from hashset
		
		myset.remove("welcome"); //put direct element value (not index value)
		
		System.out.println("After remvoing element from hashset:" + myset); // [null, A, 100, 10.5, welcome, true]
		
		
		// Inserting element is not possible
		
		// Accessing specific element is not possible
		
		// Convering Hashset into ArrayList
		
		ArrayList al=new ArrayList(myset);
		
		System.out.println(al); //[null, A, 100, 10.5, true]e
		System.out.println(al.get(2));  //100
		
		// Reading data from hashset using for loop
		
		
		for(Object x:myset)
		{
			System.out.println(x);
		}
		
		// By usin Itrerator
		
		Iterator<Object>it=myset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		
		
		// Clearing all the element for hashset
		
		myset.clear();
		
		System.out.println(myset.isEmpty());
		

		

	}

}
