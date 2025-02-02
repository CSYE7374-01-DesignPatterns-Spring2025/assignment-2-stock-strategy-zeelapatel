package edu.neu.csye7374;

public class TechStock extends StockAPI {
    public TechStock(double price, stockMarketStrategy strategy) {
        super("TechStock", price, strategy);
    }
}