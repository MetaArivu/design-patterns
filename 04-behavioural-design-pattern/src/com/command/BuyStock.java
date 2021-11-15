package com.command;

public class BuyStock implements Order {
	private Stock stock;

	public BuyStock(Stock _stock) {
		this.stock = _stock;
	}

	public void execute() {
		stock.buy();
	}
}