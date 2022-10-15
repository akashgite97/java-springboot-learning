package com.springcoretutorial.bcycle;

public class Beancycle {
	
   private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Beancycle() {
	super();
	// TODO Auto-generated constructor stub
}


public void init() {
	System.out.println("Init Method");
}

public void destroy() {
	System.out.println("Destroy Method");
}


@Override
public String toString() {
	return "Beancycle [price=" + price + "]";
}


}
