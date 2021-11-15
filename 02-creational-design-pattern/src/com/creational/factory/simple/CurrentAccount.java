package com.creational.factory.simple;

public class CurrentAccount implements Account{

	private String name;
	private String accNo;

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private String getAccNo() {
		return accNo;
	}

	private void setAccNo(String accNo) {
		this.accNo = accNo;
	}

}
