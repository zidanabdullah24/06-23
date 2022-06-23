package com.rev.ex.list;

public class IceCream {
private String flavor;
private String type;
private int scoops;
private int price;
public String getFlavor() {
	return flavor;
}
public void setFlavor(String flavor) {
	this.flavor = flavor;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getScoops() {
	return scoops;
}
public void setScoops(int scoops) {
	this.scoops = scoops;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;



}
public IceCream() {
	super();


}
public IceCream(String flavor, String type, int scoops, int price) {
	super();
	this.flavor = flavor;
	this.type = type;
	this.scoops = scoops;
	this.price = price;
	
	
}
@Override
public String toString() {
	return "IceCream [flavor=" + flavor + ", type=" + type + ", scoops=" + scoops + ", price=$" + price + "]";
}
}
