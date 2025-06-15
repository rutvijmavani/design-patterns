package com.example;
import com.example.FlyStrategy.FlyNoWay;
import com.example.QuackStrategy.Squeak;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello strategy!");
        Duck Mallard = new MallardDuck();
        Mallard.performQuack();
        Mallard.performFly();
        Mallard.setQuackBehavior(new Squeak());
        Mallard.setFlyBehavior(new FlyNoWay());
        Mallard.performFly();
        Mallard.performQuack();
    }
}