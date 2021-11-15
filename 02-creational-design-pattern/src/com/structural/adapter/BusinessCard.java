package com.structural.adapter;

public class BusinessCard {

	public String businessCardContent(Customer customer) {
		return customer.getName() + "\n" + customer.getDetails();
	}
}
