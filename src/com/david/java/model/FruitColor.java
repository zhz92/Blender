package com.david.java.model;

public enum FruitColor {
	
	PURPLE("Purple", 0x2E0854), BLACK("Black", 0x000000), GREEN("Green", 0x00FF00);
	private String name;
	private long color;
	
	FruitColor (String name, long color) {
		this.name = name;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
