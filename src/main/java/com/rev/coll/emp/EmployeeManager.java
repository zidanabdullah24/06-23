package com.rev.coll.emp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class EmployeeManager {
	public static void main(String[] args) {
	
		Employee e1 = new Employee(24, "Zidan", "Abdullah", 22000  );
		Employee e2 = new Employee(42, "Sam", "Abdullah", 125000  );
		Employee e3 = new Employee(9, "Bernie", "Abdallah", 22000  );
		Employee e4 = new Employee(2, "Michelle", "Hai", 32000  );
		Employee e5 = new Employee(52, "Patrick", "Willis", 22000  );

	
	List<Employee> myEmps = new ArrayList<Employee>();

	
	myEmps.add(e1);
	myEmps.add(e2);
	myEmps.add(e3);
	myEmps.add(e4);
	myEmps.add(e5);
	
	System.out.println(myEmps);
	
	

	Iterator myEmpsItr=(Iterator) myEmps.iterator();
	while(myEmpsItr.hasNext())
		System.out.print("\n" +myEmpsItr.next()+" -");
	System.out.println();
	
	Collections.sort( myEmps);
	System.out.println(myEmps);
	
	}
}