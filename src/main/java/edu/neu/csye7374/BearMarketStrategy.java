package edu.neu.csye7374;

public class BearMarketStrategy  implements stockMarketStrategy{

	@Override
	public double calculateNewPrice(double currentPrice) {
		return currentPrice * 0.90 ;
	}

}   
