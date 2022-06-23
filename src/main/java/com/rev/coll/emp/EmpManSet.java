package com.rev.coll.emp;

import java.util.HashSet;
import java.util.Set;

public class EmpManSet {
	public static void main(String[] args) {
		

		Employee e1 = new Employee(24, "Zidan", "Abdullah", 22000  );
		Employee e2 = new Employee(42, "Sam", "Abdullah", 125000  );
		Employee e3 = new Employee(9, "Bernie", "Abdallah", 22000  );
		Employee e4 = new Employee(2, "Michelle", "Hai", 32000  );
		Employee e5 = new Employee(52, "Patrick", "Willis", 22000  );
	
		Set<Employee> myEmp = new HashSet<Employee>();
	
	myEmp.add(e1);
	myEmp.add(e2);
	myEmp.add(e3);
	myEmp.add(e4);
	myEmp.add(e5);
	
	for(Employee e:myEmp)
		System.out.println("\n" +e);
	}

}
