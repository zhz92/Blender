package com.david.java.model;

public enum FruitName {
	
	APPLE("Apple"), ORANGE("Orange"), BANANA("Banana");
	private String name;
	
	FruitName (String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
