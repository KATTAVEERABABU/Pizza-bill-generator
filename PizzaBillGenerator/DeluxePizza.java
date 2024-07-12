package com.PizzaBillGenerator;

public class DeluxePizza extends BasePizza{

	public DeluxePizza(boolean veg,String name) {
		super(veg,name);
		super.AddExtraCheese();
		super.AddExtraToppings();
	}
	//no option for customer to add extra cheese and toppings
	@Override
	public void AddExtraCheese() {
	}
	@Override
	public void AddExtraToppings() {
		
	}
}
