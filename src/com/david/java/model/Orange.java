package com.david.java.model;

public class Orange extends Fruit{

	public Orange() {
		super(FruitName.ORANGE, FruitColor.BLACK, 4);
	}

	@Override
	public String getOrigin() {
		return "Mexico";
	}

}
