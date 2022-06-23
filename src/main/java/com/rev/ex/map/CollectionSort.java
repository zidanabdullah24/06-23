package com.rev.ex.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {
	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<String>();
		
		myList.add("brooke");
		myList.add("nick");
		myList.add("archer");
		myList.add("zidan");
		myList.add("august");
		
		System.out.println(myList);
		
		Collections.sort(myList);
		System.out.println(myList);
	
		Collections.reverse(myList);
		Collections.sort(myList, Collections.reverseOrder());
		
		System.out.println(myList);
	}

}
