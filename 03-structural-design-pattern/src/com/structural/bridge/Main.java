package com.structural.bridge;

//https://refactoring.guru/design-patterns/bridge
public class Main {

	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();

		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}
}
