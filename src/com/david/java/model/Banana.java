package com.david.java.model;

public class Banana extends Fruit{

	public Banana() {
		super(FruitName.BANANA, FruitColor.GREEN, 1);
	}

	@Override
	public String getOrigin() {
		return "Brazil";
	}

}
