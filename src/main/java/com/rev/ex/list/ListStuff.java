package com.rev.ex.list;

import java.util.ArrayList;
import java.util.List;

public class ListStuff {
	public static void main(String[] args) {
		
		List<IceCream> myIceCream  = new ArrayList<IceCream>();
		
		IceCream i1= new IceCream("Vanilla", "Cone", 2, 5);
		IceCream i2= new IceCream("Chocolate", "Bowl", 3, 6);
		IceCream i3= new IceCream("Strawberry", "Waffle", 3, 8);
		IceCream i4= new IceCream("Banana Split", "plate", 5, 15);
		
	myIceCream.add(i1);
	myIceCream.add(i2);
	myIceCream.add(i3);
	myIceCream.add(i4);
	
	System.out.println(myIceCream);
	
	}

}
