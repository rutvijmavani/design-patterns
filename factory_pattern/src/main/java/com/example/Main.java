package com.example;

import com.example.PizzaFactory.SimplePizzaFactory;
import com.example.pizza.Pizza;
import com.example.pizzaStore.PizzaStore;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
 
		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
    }
}