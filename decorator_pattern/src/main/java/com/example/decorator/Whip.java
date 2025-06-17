package com.example.decorator;

import com.example.beverage.Beverage;

public class Whip extends  CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
    @Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
    @Override
	public double cost() {
		return .10 + beverage.cost();
	}
    
}
