package com.david.java.model;

public abstract class Fruit {
	
//	public static final String APPLE = "Apple";
	
	private FruitName name = FruitName.APPLE;
	private FruitColor color = FruitColor.PURPLE;
	private int juice = 3;
	
	public Fruit (FruitName name, FruitColor color, int juice) {
		this.name = name;
		this.color = color;
		this.juice = juice;
	}
	
	public FruitName getName() {
		return name;
	}
	public void setName(FruitName name) {
		this.name = name;
	}
	public FruitColor getColor() {
		return color;
	}
	public void setColor(FruitColor color) {
		this.color = color;
	}
	public int getJuice() {
		String msg = name + " from " + getOrigin() + ": " + juice + "units.";
		System.out.println(msg);
		return juice;
	}
	public void setJuice(int juice) {
		this.juice = juice;
	}
	
	public abstract String getOrigin();
	
	public String toString() {
		return name.toString();
	}
	

}

