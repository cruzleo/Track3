package org.ssglobal.training.codes.itemD;

public abstract class Vehicle {
	private String name;
	private int maxPassenger;
	private int maxSpeed;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxPassenger() {
		return maxPassenger;
	}
	public void setMaxPassenger(int maxPassenger) {
		this.maxPassenger = maxPassenger;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
}
