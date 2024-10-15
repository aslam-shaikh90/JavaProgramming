package day20;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// Array List Declaration
		
		ArrayList mylist=new ArrayList();
		
		// List mylist=new ArrayList();
		
		// ArrayList<String> mylist=new ArrayList<String>();
		
		
		
		// Adding data into Arraylist
		
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		// find size of arryalist
		
		System.out.println("size of the an Arraylist:" + mylist.size()); // output size of the an Arraylist:8

		
		// pring the data from arraylist
		
		System.out.println("Printig data from arraylist:"+ mylist);
		
		// Remove from arrya list
		
		mylist.remove(5);
		System.out.println("After removing value from array:" + mylist);
		
		// Insert value in ArrayList
		
		mylist.add(2,"Java");
		System.out.println("After adding data into ArrayList:" + mylist);
		
		//modify/replace/change in the ArrayList
		
		mylist.set(2,"python");
		System.out.println("After replacing data into ArrayList:" + mylist);
		
		// Accessing specific data from ArrayList
		
		System.out.println(mylist.get(3)); // here is 3 index and output will be "welcome"
		
		// Reading all the data from ArrayList
		
		// using normal for loop
		
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
		
		
		// by using for..each loop
		
		for(Object x:mylist)
		{
			System.out.println(x);
		
		}
		
		// by using Iterator
		
		Iterator it=mylist.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		// Checking ArraList is emty or not?
		
		System.out.println("Is ArrayList emty?" +mylist.isEmpty());
		
		// remove all the element from ArrayList
		
		ArrayList mylist2=new ArrayList();// create temp List and add element in it which need to be remove
				
		mylist2.add(100);
		mylist2.add("welcome");
		
		mylist.removeAll(mylist2);
		System.out.println("After removing multiple element:" + mylist);
		
		
		// Remove/clear all the element from ArrayList
		
		mylist.clear();
		System.out.println("Is my ArrayList Emty?" + mylist.isEmpty());
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		

		

	}

}
