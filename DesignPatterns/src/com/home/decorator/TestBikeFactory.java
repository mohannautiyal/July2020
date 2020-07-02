package com.home.decorator;

public class TestBikeFactory {

	public static void main(String[] args) {
 
		Bike simpleBike = new BasicBike();
		//simpleBike.assembleBike();
		
		SportsBike sportsBike = new SportsBike(simpleBike);
		sportsBike.assembleBike();
	}

}
