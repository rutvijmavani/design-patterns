package com.example.IngredientFactory;
import com.example.IngredientFactory.cheese.*;
import com.example.IngredientFactory.dough.*;
import com.example.IngredientFactory.sauce.*;
import com.example.IngredientFactory.clams.*;
import com.example.IngredientFactory.pepperoni.*;
import com.example.IngredientFactory.veggies.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
		return new ThickCrustDough();
	}

    @Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

    @Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

    @Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), 
		                      new Spinach(), 
		                      new Eggplant() };
		return veggies;
	}

    @Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

    @Override
	public Clams createClam() {
		return new FrozenClams();
	}
}
