package com.rev.ex.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListOne {

	public static void main(String[] args) {
		
		List<String> myList =  new LinkedList<String>();
		
		myList.add("xyz");
		myList.add("depends");
		myList.add("abc");
		myList.add("timmy");
		
		System.out.println(myList);
		
		Iterator myListItr=(Iterator) myList.iterator();
		while(myListItr.hasNext())
			System.out.print("\n" +myListItr.next()+" -");
		System.out.println();
		
	myList.add("melvin");
	myList.remove("xyz");
	
	System.out.println(myList);
	
	
	
	System.out.println(myList);
	
	List<String>myNewList = new LinkedList<String>();
	
	myNewList.add("sweet");
	myNewList.add("awesome");
	myNewList.addAll(myList);
	
	
	System.out.println(myList);
	

	Collections.reverse(myList);
	
	
	System.out.println(myList);}
	
}
