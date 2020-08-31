package p1;

public class CoffeeLatteValue extends CoffeeValue{
	
	protected int capacityMilk;
	
	public CoffeeLatteValue(String coffeeName , int capacityTotal , int capacityMilk) {
		super(coffeeName , capacityTotal);
		this.capacityMilk = capacityMilk;
	}
	
	public String getInfo() {
		return "Milk Capcity : " + (this.capacityMilk) +"ml";
	}
	
	public String getDescription() {
		
		String rt = super.getInfo();
		rt +="\n";
		rt += this.getInfo();
		
		return rt;
	}
	
	public static void main(String[] args) {
		CoffeeLatteValue order1 = new CoffeeLatteValue("Cafe Latte", 500 , 100);
		System.out.println(order1.getDescription());
	}

}
