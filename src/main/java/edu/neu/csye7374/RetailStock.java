package edu.neu.csye7374;

public class RetailStock extends StockAPI {
	public RetailStock(double price, stockMarketStrategy strategy) {
		super("RetailStock", price, strategy);
	}
}