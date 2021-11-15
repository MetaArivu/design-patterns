package com.command;

public class Stock {

	private String name;
	private int qty;

	public Stock(String name, int qty) {
		super();
		this.name = name;
		this.qty = qty;
	}

	public void buy() {
		System.out.println("Buying Stock="+name+" Qty="+qty);
	}

	public void sell() {
		System.out.println("Selling Stock="+name+" Qty="+qty);
	}

}
