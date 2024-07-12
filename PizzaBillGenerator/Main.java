package com.PizzaBillGenerator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("-----Welcome to the pizza store-----"+"\n");
		
		System.out.println("Price List:"+"\n"+"veg pizza     ---> 300"+"\n"+"non-veg pizza ---> 400"+"\n"+"Extra Toppings---> 150"+"\n"+"Extra Cheese  ---> 100"+"\n"+"TakeAway      ---> 20"+"\n");
		
		System.out.println("Enter your name:");
		String name=sc.next();
		System.out.println();
		
		
		//selection of veg or non-veg pizza
		System.out.println("Select the pizza:"+"\n"+"1.veg pizza        "+"2.non-veg pizza");
		int k=sc.nextInt();
		System.out.println();
		boolean veg = false;
		switch(k) {
		case 1:{
			veg=true;
			break;
		}
		case 2:{
			veg=false;
			break;
		}
		default:
			System.out.println("select the correct one");
			System.exit(0);
		}
		
		
		//selection of base pizza or deluxe pizza
		System.out.println("Select the type pizza:"+"\n"+"1.Base pizza        "+"2.Deluxe pizza");
		int n=sc.nextInt();
		System.out.println();
		switch(n) {
		case 1:{
			BasePizza bp=new BasePizza(veg,name);
			
			//Extra toppings 
			System.out.println("Extra Toppings:"+"\n"+"1.YES        "+"2.NO");
			int toppings=sc.nextInt();
			System.out.println();
			switch(toppings) {
			case 1:{
				bp.AddExtraToppings();
				break;
			}
			case 2:{
				break;
			}
			default:
				System.out.println("select the correct one");
				System.exit(0);
			}
			
			//Extra cheese options
			System.out.println("Extra cheese:"+"\n"+"1.YES        "+"2.NO");
			int cheese=sc.nextInt();
			System.out.println();
			switch(cheese) {
			case 1:{
				bp.AddExtraCheese();
				break;
			}
			case 2:{
				break;
			}
			default:
				System.out.println("select the correct one");
				System.exit(0);
			}
			
			//Takeway or dine in actions
			System.out.println("Choose the delivery action:"+"\n"+"1.Takeway        "+"2.Dine-in");
			int takeaway=sc.nextInt();
			System.out.println();
			switch(takeaway) {
			case 1:{
				bp.TakeAway();
				break;
			}
			case 2:{
				break;
			}
			default:
				System.out.println("select the correct one");
				System.exit(0);
			}
			System.out.println("-----------------------------------------"+"\n");
			
			//Generating the bill
			bp.GetBill();
			break;
		}
		
		
		case 2:{
			DeluxePizza dp=new DeluxePizza(veg,name);
			//Takeway or dine in actions for deluxe pizza
			System.out.println("Choose the delivery action:"+"\n"+"1.Takeway        "+"2.Dine-in");
			int takeaway=sc.nextInt();
			System.out.println();
			switch(takeaway) {
			case 1:{
				dp.TakeAway();
				break;
			}
			case 2:{
				break;
			}
			default:
				System.out.println("select the correct one");
				System.exit(0);
			}
			System.out.println("-----------------------------------------"+"\n");
			//Generating bill
			dp.GetBill();
			break;
		}
		default:
			System.out.println("select the correct one");
			System.exit(0);
		}
		sc.close();
		
	}

}