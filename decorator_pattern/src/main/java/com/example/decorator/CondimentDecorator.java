package com.example.decorator;
import com.example.beverage.*;

public abstract class CondimentDecorator extends Beverage {
    
    @Override
    public abstract String getDescription();
}
