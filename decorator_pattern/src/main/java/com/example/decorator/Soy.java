package com.example.decorator;

import com.example.beverage.Beverage;

public class Soy extends CondimentDecorator{

    Beverage beverage;

    public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

    @Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

    @Override
	public double cost() {
		return .15 + beverage.cost();
	}
    
}
