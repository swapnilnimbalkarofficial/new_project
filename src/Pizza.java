
public class Pizza {

	private int price;
	private Boolean veg;
	
	private int extraChees=50;
	private int extraToppings=70;
	private int backPack=20;
	
	private boolean isaddExtraChees=false;
	private boolean isaddExtraToppings=false;
	private boolean istakeAway=false;
	
	
	
	public Pizza(Boolean veg) {
		this.veg = veg;
		
		if(this.veg) {
			this.price=350;
		}
		else {
			this.price=450;
		}
	}
	
	public void aadExtraCheese() {
		isaddExtraChees=true;
		this.price+=extraChees;
	}
	
	public void aadExtraToppings() {
		isaddExtraToppings=true;
		this.price+=extraToppings;
	}
	
	public void takeAway() {
		istakeAway=true;  
		this.price+=backPack;
	}	
	
	public void getBill() {
		String bill="";
		System.out.println(this.price);
		if(isaddExtraChees) {
			bill+="Extra cheese added: "+extraChees+ "\n";
		}
		if(isaddExtraToppings) {
			bill+="Extra Toppings added: "+extraToppings+ "\n";
		}
		if(istakeAway) {
			bill+="Take Away: "+backPack+ "\n";
		}
		bill+="Bill: "+this.price+"\n";
		System.out.println(bill);
		
	}
}
