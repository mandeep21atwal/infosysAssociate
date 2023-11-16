package mandeepJavaApp;

public class Demo {
	
	public static void main(String[] args) {
		int pizzaPrice=280;
		int quantity=2;
		long totalCost = pizzaPrice * quantity;

		// TODO Auto-generated method stub
		System.out.println("Mandeep Thanks ......");
		
		if(totalCost>2000 && totalCost<=10000){
		    float totalCostWithDiscount = totalCost - (totalCost * (float)5/100);
		}
		else if(totalCost>10000){
		    float totalCostWithDiscount = totalCost - (totalCost * (float)10/100);
		}
		else{
		    System.out.println("No Discount");
		}


	}

}
