package com.home.decorator;

public class BikeDecorator implements Bike {

	Bike bike;

	public BikeDecorator(Bike bike) {
		super();
		this.bike = bike;
	}

	@Override
	public void assembleBike() {

		bike.assembleBike();
	}

}
