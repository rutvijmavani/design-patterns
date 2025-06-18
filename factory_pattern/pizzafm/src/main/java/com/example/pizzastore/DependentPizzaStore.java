package com.example.pizzastore;
import com.example.pizza.ChicagoStyleCheesePizza;
import com.example.pizza.ChicagoStyleClamPizza;
import com.example.pizza.ChicagoStylePepperoniPizza;
import com.example.pizza.ChicagoStyleVeggiePizza;
import com.example.pizza.NYStyleCheesePizza;
import com.example.pizza.NYStyleClamPizza;
import com.example.pizza.NYStylePepperoniPizza;
import com.example.pizza.NYStyleVeggiePizza;
import com.example.pizza.Pizza;

public class DependentPizzaStore {
    public Pizza orderPizza(String style, String type) {
		Pizza pizza = null;
		if (style.equals("NY")) {
			if (type.equals("cheese")) {
				pizza = new NYStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new NYStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new NYStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new NYStylePepperoniPizza();
			}
		} else if (style.equals("Chicago")) {
			if (type.equals("cheese")) {
				pizza = new ChicagoStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new ChicagoStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new ChicagoStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new ChicagoStylePepperoniPizza();
			}
		} else {
			System.out.println("Error: invalid type of pizza");
			return null;
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
