
public class Main {
	public static void main(String[] args) {
//		Pizza pizza= new Pizza(true );
//		pizza.aadExtraCheese();//50
//		pizza.aadExtraToppings();//70
//		pizza.takeAway();//20
//		pizza.getBill();
		
		DeluxPizza delux= new DeluxPizza(true);
		delux.aadExtraCheese();
		delux.aadExtraToppings();
		delux.getBill();
	}
}
