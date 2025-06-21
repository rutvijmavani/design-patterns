package com.example.IngredientFactory;
import com.example.IngredientFactory.cheese.*;
import com.example.IngredientFactory.dough.*;
import com.example.IngredientFactory.sauce.*;
import com.example.IngredientFactory.clams.*;
import com.example.IngredientFactory.pepperoni.*;
import com.example.IngredientFactory.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    
    @Override
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
    @Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

    @Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
    
    @Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
    @Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

    @Override
	public Clams createClam() {
		return new FreshClams();
	}
}
