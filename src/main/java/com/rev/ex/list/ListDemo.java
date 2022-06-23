package com.rev.ex.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ListDemo {
	public static void main(String[] args) {
		

		List<String> myList= new ArrayList<String>();
		myList.add("Scuba");
		myList.add("Bernie");
		myList.add("Mikie");
		myList.add("Bernie");
		myList.add("Steve");
		
		
		System.out.println(myList);
		
		//1st way to display
		for(int i=0 ; i<myList.size(); i++)
			System.out.println(myList.get(i)+ ",");
		
		// 2nd Way -- using an iterator
		Iterator myListItr=(Iterator) myList.iterator();
		while(myListItr.hasNext())
			System.out.print(myListItr.next()+" -");
		System.out.println();
	
		// 3rd way -- using Enhanced for Loop
		for(String s:myList)
			System.out.print(s +"#");
		
		myList.add("joe");
		
		myList.remove("bernie");
		
		for(String s:myList)
			System.out.println(s);
		
		List<String> myList2 = new ArrayList<String>();
		myList2.add("St");
		myList2.add("marvin");
		
		myList.addAll(myList2);
		
		for(String s:myList)
			System.out.print(s + " $ ");
			System.out.println();
			System.out.println("Does the list contain me " + myList.contains("marvin"));
			
			
		
	}

}
