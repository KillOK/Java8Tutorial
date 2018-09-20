package com.killok.java8tutorial.observerandlambdausage.consumers;


public class Lamp implements ElectricityConsumer{
	
	public void lightOn() {

		System.out.println("Light is turned on!");
		

	}

	@Override
	public void electricityOn() {
//		ElectricityConsumer.super.electricityOn();
		
		lightOn();
		
	}

	
}
