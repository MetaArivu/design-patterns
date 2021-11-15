package com.creational.factory.simple;

public class Main {

	public static void main(String[] args) {
		
		Account acc = AccountFactory.create("saving");
		System.out.println(acc);
		
		acc = AccountFactory.create("current");
		System.out.println(acc);
		
	}
}
