package com.builder;

public class Main {

	public static void main(String[] args) {
		EmployeeDTO emailBuilderExample = new EmployeeDTO.Builder()
				.email("john.doe@gmail.com")
				.from("jane.doe@gmail.com")
				.subject("Test Email")
				.cc("john.doe@gmail.com")
				.bcc("jane.doe@gmail.com")
				.build();
		
		System.out.println(emailBuilderExample);
		
		
	}
}
