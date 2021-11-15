package com.command;

public class SellStock implements Order {
	private Stock stock;

	public SellStock(Stock _stock) {
		this.stock = _stock;
	}

	public void execute() {
		stock.sell();
	}
}