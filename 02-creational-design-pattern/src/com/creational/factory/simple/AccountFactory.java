package com.creational.factory.simple;

public class AccountFactory {

	public static Account create(String type) {

		switch (type) {
		case "saving": {
			return new SavingAccount();
		}
		case "current": {
			return new CurrentAccount();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}
}
