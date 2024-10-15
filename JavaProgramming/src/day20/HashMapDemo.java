package day20;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		// Declaration
		
		 //HashMap map=new HashMap();
		//Map map=new HashMap();
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		// add data into Hashmap
		
		map.put(101,"Aslam");
		map.put(102,"Bapu");
		map.put(103,"Rahul");
		map.put(104,"Santosh");
		map.put(101,"Daya");
		
		// Printing data from Hashmap		
		System.out.println(map); //{101=Daya, 102=Bapu, 103=Rahul, 104=Santosh}
     
		  // remove pair
		
		map.remove(104); // 104 is pair key
		System.out.println("After removing pair:" + map); //{101=Daya, 102=Bapu, 103=Rahul}
		
		// access value of key
		System.out.println(map.get(103));  //Rahul
		
		//get the all key from hashmap
		System.out.println(map.keySet());//[101, 102, 103]
		
		//get the all value from hashmap
		System.out.println(map.values());//[Daya, Bapu, Rahul]

		//get the all key and value from hashmap
		System.out.println(map.entrySet());//[101=Daya, 102=Bapu, 103=Rahul]
		
		//Reading data from hashset user for loop
		
		for(int k:map.keySet())
		{
			System.out.println(k+"  "+map.get(k));
		}
		
		
		

		
		
		

		

	}

}
