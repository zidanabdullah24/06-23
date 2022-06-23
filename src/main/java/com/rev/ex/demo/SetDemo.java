package com.rev.ex.demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
public static void main(String[] args) {
	
	//Set<String> mySet = new HashSet<String>();
	//Set<String> mySet = new TreeSet<String>();
	Set<String> mySet = new LinkedHashSet<String>();

	mySet.add("joe");
	mySet.add("michelle");
	mySet.add("joe");
	mySet.add("rob");
	mySet.add("adam");
	mySet.add(null);
	
	for(String s:mySet)
		System.out.println(s);

}
}
