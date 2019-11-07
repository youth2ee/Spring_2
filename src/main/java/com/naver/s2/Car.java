package com.naver.s2;

import java.util.ArrayList;
import java.util.HashMap;

public class Car {
	private Engine engine;
	private Wheel wheel;
	private ArrayList<String> name;
	private HashMap<String, Integer> price;
	
	public Car() {		
	}

	public Car(Engine engine, Wheel wheel) {
		this.engine = engine;
		this.wheel = wheel;
		
	}
	

	public HashMap<String, Integer> getPrice() {
		return price;
	}

	public void setPrice(HashMap<String, Integer> price) {
		this.price = price;
	}

	public ArrayList<String> getName() {
		return name;
	}

	public void setName(ArrayList<String> name) {
		this.name = name;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public void info() {
		System.out.println("Engine Fuel : "+this.engine.getFuel());
		System.out.println("Wheel Brand : "+this.wheel.getBrand());
	}
	
}
