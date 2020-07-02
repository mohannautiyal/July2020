package com.home.decorator;

public class SportsBike extends BikeDecorator {

	public SportsBike(Bike bike) {
		super(bike);
	}

	@Override
	public void assembleBike() {

		super.assembleBike();
		System.out.println("Sports Bike features added..");
	}

}
