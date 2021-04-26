package com.itsj.factory;

public class MainFactory {
	public static void main(String[] args)
	{
		Car car = CarFactory.getCar(CarType.VINFAST);
		System.out.println(car.getCarName());
	}
}
