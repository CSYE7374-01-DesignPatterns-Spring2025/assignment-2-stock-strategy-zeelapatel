package edu.neu.csye7374;

public class BullMarketStrategy implements stockMarketStrategy {

	@Override
	public double calculateNewPrice(double currentPrice) {
		return currentPrice * 1.20;
	}

}
