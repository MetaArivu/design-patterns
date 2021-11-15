package com.structural.adapter;

public class EmployeeAdapter extends Employee implements Customer {

	@Override
	public String getName() {
		return this.getFirstName() + " " + this.getLastName();
	}

	@Override
	public String getDetails() {
		return this.getEmail();
	}

}
