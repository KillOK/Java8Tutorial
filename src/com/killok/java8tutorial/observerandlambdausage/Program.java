package com.killok.java8tutorial.observerandlambdausage;


import com.killok.java8tutorial.observerandlambdausage.consumers.ElectricityConsumer;
import com.killok.java8tutorial.observerandlambdausage.consumers.Lamp;
import com.killok.java8tutorial.observerandlambdausage.consumers.Laptop;
import com.killok.java8tutorial.observerandlambdausage.consumers.Radio;
import com.killok.java8tutorial.observerandlambdausage.consumers.TV;

public class Program {
	
	public static void sayHello() {
		System.out.println("Hello");
	}
	

	public static void main(String[] args) {
		
		Switcher sw = new Switcher(new Lamp(),new Laptop(),new Radio(),new TV());		// add Subscribers
		
//		sw.addElectricityConsumers(new ElectricityConsumer() {});	// add anonimus instance of interface only with default method
		
		// java 8 features:
		
		// anonimus
		
		sw.addElectricityConsumer(
				new ElectricityConsumer() {
					@Override
					public void electricityOn() {
						System.out.println("CellPhone1 is connected");
					};
				});
		
		
		sw.addElectricityConsumer( 
				/*new ElectricityConsumer() {				//Don't need it all, because jvm knows that type of argument is functional interface
					public void electricityOn*/() -> /*{*/
						System.out.println("CellPhone2 is connected")/*;
					};
				}*/);
		
		sw.addElectricityConsumer(()->System.out.println("CellPhone3 is connected"));  // Could also use param name from functional interface instead of () brackets, if we had the only param in it of course
		
		
		
		sw.addElectricityConsumer(() -> Program.sayHello());    // Can call lambda, but method should be static, and have the same params as mthe method in functional interface 
				
		sw.addElectricityConsumer(Program::sayHello);		// The same, as previous 
		
		// objects usage
		
		Lamp l = new Lamp();
		
		sw.addElectricityConsumer(l::lightOn);
		
		sw.switchOn();  // Publish

	}

}
