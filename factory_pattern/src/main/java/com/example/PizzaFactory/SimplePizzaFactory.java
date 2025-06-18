package com.example.PizzaFactory;
import com.example.pizza.*;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza;

        if(type.equals("cheese")){
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")){
            pizza = new ClamPizza();
        } else if (type.equals("veggie")){
            pizza = new VeggiePizza();
        }
        else return null;

        return pizza;
    }
}
