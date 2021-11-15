package com.structural.decorator;

//https://www.journaldev.com/1540/decorator-design-pattern-in-java-example
public class Main {

	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		
		System.out.println("\n*****");

		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
		
		System.out.println("\n*****");

		Car luxurySportCar = new LuxuryCar(new SportsCar(new BasicCar()));
		luxurySportCar.assemble();
	
		
	}
}
