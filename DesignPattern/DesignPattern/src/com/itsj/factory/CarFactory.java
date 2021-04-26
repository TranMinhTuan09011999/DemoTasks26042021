package com.itsj.factory;

public class CarFactory {
	private CarFactory() {
		
	}
	
	public static final Car getCar(CarType cartType) {
		switch(cartType) {
		case VINFAST:
			return new Vinfast();
		case TOYOTA:
			return new Toyota();
		default:
			throw new IllegalArgumentException("This car type don't have");
		}
	}
}
