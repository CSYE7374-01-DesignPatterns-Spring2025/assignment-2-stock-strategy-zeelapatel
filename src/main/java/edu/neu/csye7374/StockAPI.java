package edu.neu.csye7374;

public abstract class StockAPI {
    private String name;
    private double price;
    private stockMarketStrategy strategy;

    public StockAPI(String name, double price, stockMarketStrategy strategy) {
        this.name = name;
        this.price = price;
        this.strategy = strategy;
    }

    public void updatePrice() {
        this.price = strategy.calculateNewPrice(this.price);
    }

    public void setStrategy(stockMarketStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public String toString() {
        return name + ": $" + String.format("%.2f", price);
    }
    
    static void demo() {
    	stockMarketStrategy bullMarket = new BullMarketStrategy();
    	stockMarketStrategy bearMarket = new BearMarketStrategy();

        StockAPI techStock = new TechStock(150.0, bullMarket);
        StockAPI retailStock = new RetailStock(100.0, bearMarket);

        System.out.println("Initial Prices:");
        System.out.println(techStock);
        System.out.println(retailStock);

        techStock.updatePrice();
        retailStock.updatePrice();

        System.out.println("\nAfter First Price Update:");
        System.out.println(techStock);
        System.out.println(retailStock);

        techStock.setStrategy(bearMarket);
        retailStock.setStrategy(bullMarket);

        techStock.updatePrice();
        retailStock.updatePrice();

        System.out.println("\nAfter Second Price Update (Switched Strategies):");
        System.out.println(techStock);
        System.out.println(retailStock);
    
    }
}
