package com.example;

import com.example.pizza.Pizza;
import com.example.pizzastore.ChicagoPizzaStore;
import com.example.pizzastore.DependentPizzaStore;
import com.example.pizzastore.NYPizzaStore;
import com.example.pizzastore.PizzaStore;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("clam");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		// pizza = nyStore.orderPizza("pepperoni");
		// System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		// pizza = chicagoStore.orderPizza("pepperoni");
		// System.out.println("Joel ordered a " + pizza.getName() + "\n");

		// pizza = nyStore.orderPizza("veggie");
		// System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		// pizza = chicagoStore.orderPizza("veggie");
		// System.out.println("Joel ordered a " + pizza.getName() + "\n");

        DependentPizzaStore dependetStore = new DependentPizzaStore();
        pizza = dependetStore.orderPizza("NY", "cheese");
        System.out.println("J ordered a " + pizza.getName() + "\n");
    }
}