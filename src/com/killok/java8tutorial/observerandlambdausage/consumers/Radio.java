package com.killok.java8tutorial.observerandlambdausage.consumers;

public class Radio implements ElectricityConsumer {
	
	public Radio() {}

	public void lightOn() {

		System.out.println("Radio is turned on!");

	}

	@Override
	public void electricityOn() {
	    // ElectricityConsumer.super.electricityOn();

		lightOn();

	}

}