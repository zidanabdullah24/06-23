package com.rev.ex.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		
		//Map<String, Integer> myMap = new Hashtable<String, Integer>();
		Map<String, Integer> myMap = new TreeMap<String, Integer>();
		myMap.put("mike", 2500);
		myMap.put("joe", 25000);
		myMap.put("jem", 7474);
		//myMap.put("mike", 26);
		
		System.out.println(myMap);
		System.out.println(myMap.get("mike"));
		
	// Map cannot be iterated
		// in order to iterate we use keySet() that returns a set of keys
		Set<String> myKeys=myMap.keySet();
		for(String s:myKeys)
			System.out.println(s + " - " +myMap.get(s));
		
	
	}

}
