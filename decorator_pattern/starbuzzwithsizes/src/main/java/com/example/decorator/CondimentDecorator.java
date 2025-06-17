package com.example.decorator;

import com.example.beverage.*;

public abstract class CondimentDecorator extends Beverage {
    
    public Beverage beverage;
	
    @Override
    public abstract String getDescription();
	
    @Override
	public Size getSize() {
		return beverage.getSize();
	}
}
