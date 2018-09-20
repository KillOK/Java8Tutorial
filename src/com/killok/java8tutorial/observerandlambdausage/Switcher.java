package com.killok.java8tutorial.observerandlambdausage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.killok.java8tutorial.observerandlambdausage.consumers.ElectricityConsumer;

public class Switcher {
	
	public Switcher() {}
	
	public Switcher(ElectricityConsumer e) {
		electricityConsumers.add(e);
	}
	
	public Switcher(ElectricityConsumer... e) {
		electricityConsumers.addAll(Arrays.asList(e));
	}
	
	public Switcher(List<ElectricityConsumer> e) {
		electricityConsumers.addAll(e);
	}
	
	public List<ElectricityConsumer> electricityConsumers = new ArrayList<>();

	public void addElectricityConsumer(ElectricityConsumer e) {
		electricityConsumers.add(e);
	}
	
	public void addElectricityConsumers(ElectricityConsumer... e) {
		electricityConsumers.addAll(Arrays.asList(e));
	}
	
	public void addElectricityConsumers(List<ElectricityConsumer> e) {
		electricityConsumers.addAll(e);
	}
	
	public void removeElectricityConsumer(ElectricityConsumer e) {
		electricityConsumers.remove(e);
	}
	
	public void removeElectricityConsumerByIndex(int i) {
		electricityConsumers.remove(i);
	}
	
	public void switchOn() {
		
		System.out.println("Electricity turned on...");
		
		for (ElectricityConsumer electricityConsumer : electricityConsumers) {
			if(electricityConsumer!=null)electricityConsumer.electricityOn();
		}
	}

}
