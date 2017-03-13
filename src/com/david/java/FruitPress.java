package com.david.java;

import java.util.List;

import com.david.java.model.Fruit;

public class FruitPress implements Press{
	
	private int currentJuice;
	
	public int getJuice(List<Fruit> fruits) {
		
		int totalJuice = currentJuice;
		for (Fruit f: fruits) {
			System.out.println(f.getName());
			totalJuice += f.getJuice();
		}
		return totalJuice;
	}

	@Override
	public void setJuice(int juice) {
		currentJuice = juice;
	}

}
