package com.strategy;

//https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
public class Main {

	public static void main(String[] args) {
		System.out.println("10 + 5 = " + new Context(new OperationAdd()).executeStrategy(10, 5));

		System.out.println("10 - 5 = " + new Context(new OperationSubstract()).executeStrategy(10, 5));

		System.out.println("10 * 5 = " + new Context(new OperationMultiply()).executeStrategy(10, 5));
	}
}
