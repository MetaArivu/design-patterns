package com.structural.adapter;

public class Main {

	
	public static void main(String[] args) {
		EmployeeAdapter employeeAdapter = new EmployeeAdapter();
		
		employeeAdapter.setFirstName("John");
		employeeAdapter.setLastName("Doe");
		employeeAdapter.setEmail("john.doe@gmail.com");
		
		System.out.println(new BusinessCard().businessCardContent(employeeAdapter));
	}
}
