package com.ocp;

public class Main {

	public static void main(String[] args) {
		double num1 = 100;
		double num2 = 200;
		
		Addition add = new Addition();
		add.setNum1(num1);
		add.setNum2(num2);
		
		System.out.println(add.result());
		
		Subtraction sub = new Subtraction();
		sub.setNum1(num1);
		sub.setNum2(num2);
		
		System.out.println(sub.result());
	}
}
