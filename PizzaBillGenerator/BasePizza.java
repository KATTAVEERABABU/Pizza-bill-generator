package com.PizzaBillGenerator;

public class BasePizza {
	private String name;
	private boolean veg;
	private int BasePizzaPrice;
	private int pizzaPrice;
	private int ExtraCheesePrice=100;
	private int ExtraToppingsPrice=150;
	private int Backpack=20;
	
	private boolean AddExtraCheese=false;
	private boolean AddToppings=false;
	private boolean TakeAway=false;
	
	
	
	//firstly assign the cost to the pizza based on veg or non-veg pizza.

	public BasePizza(boolean veg,String name) {
		this.name=name;
		this.veg=veg;
		if(this.veg) {
			this.pizzaPrice=300;
			this.BasePizzaPrice=300;
		}
		else {
			this.pizzaPrice=400;
			this.BasePizzaPrice=400;
		}
	}
	
	public void AddExtraCheese() {
		AddExtraCheese=true;
		this.pizzaPrice+=ExtraCheesePrice;
	}
	public void AddExtraToppings() {
		AddToppings=true;
		this.pizzaPrice+=ExtraToppingsPrice;
	}
	public void TakeAway() {
		TakeAway=true;
		this.pizzaPrice+=Backpack;
	}
	public void GetBill() {
		System.out.println("Name:-"+name+"\n");
		String s1="";
		System.out.println("pizza price         ---> "+ this.BasePizzaPrice);
		if(AddExtraCheese)
			s1+="Extra Cheese price  ---> "+this.ExtraCheesePrice+"\n";
		if(AddToppings) 
			s1+="Extra Topping Price ---> "+this.ExtraToppingsPrice+"\n";
		if(TakeAway)
			s1+="Take Away Opted     ---> "+this.Backpack+"\n";
		System.out.println(s1);
		System.out.println("Grand Total         ---> "+this.pizzaPrice+"\n"+"\n");
	}

}
