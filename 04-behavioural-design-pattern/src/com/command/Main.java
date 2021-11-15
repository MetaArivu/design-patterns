package com.command;

//https://www.tutorialspoint.com/design_pattern/command_pattern.htm
public class Main {

	public static void main(String[] args) {

		BuyStock buyStockOrder = new BuyStock( new Stock("HDFCBANK", 5));
		SellStock sellStockOrder = new SellStock( new Stock("RIL", 5));

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();
	}
}
