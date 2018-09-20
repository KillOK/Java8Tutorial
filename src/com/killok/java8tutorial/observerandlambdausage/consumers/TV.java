package com.killok.java8tutorial.observerandlambdausage.consumers;

public class TV implements ElectricityConsumer {

	public void lightOn() {

		System.out.println("TV is turned on!");

	}

	@Override
	public void electricityOn() {
	    // ElectricityConsumer.super.electricityOn();

		lightOn();

	}

}