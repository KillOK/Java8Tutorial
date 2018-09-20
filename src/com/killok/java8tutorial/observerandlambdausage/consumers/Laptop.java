package com.killok.java8tutorial.observerandlambdausage.consumers;

public class Laptop implements ElectricityConsumer {
	
	public Laptop() {}

	public void lightOn() {

		System.out.println("Laptop is turned on!");

	}

	@Override
	public void electricityOn() {
	    // ElectricityConsumer.super.electricityOn();

		lightOn();

	}

}