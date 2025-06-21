package com.example.IngredientFactory;
import com.example.IngredientFactory.cheese.Cheese;
import com.example.IngredientFactory.clams.Clams;
import com.example.IngredientFactory.dough.Dough;
import  com.example.IngredientFactory.pepperoni.Pepperoni;
import com.example.IngredientFactory.sauce.Sauce;
import com.example.IngredientFactory.veggies.Veggies;

public interface PizzaIngredientFactory {

    public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
    
}
