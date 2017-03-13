package com.david.java;

import java.util.ArrayList;
import java.util.List;

import com.david.java.model.Apple;
import com.david.java.model.Banana;
import com.david.java.model.Fruit;
import com.david.java.model.FruitColor;
import com.david.java.model.FruitName;
import com.david.java.model.Orange;

public class Main {

	public static void main(String[] args) {
		List<Fruit> fruits = new ArrayList<>();

		fruits.add(new Apple());
		fruits.add(new Banana());
		fruits.add(new Orange());

		Press press = new FruitPress();
		press.setJuice(5);
		int totalJuice = press.getJuice(fruits);
		System.out.println("Total juice is " + totalJuice);

	}
}
