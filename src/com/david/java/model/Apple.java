package com.david.java.model;

public class Apple extends Fruit{

	public Apple() {
		super(FruitName.APPLE, FruitColor.PURPLE, 2);
	}

	@Override
	public String getOrigin() {
		return "America";
	}

}
