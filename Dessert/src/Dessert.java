import java.util.Scanner;

abstract class DessertItem {
	private final int dollarRate = 60;
	private final int euroRate = 70;
	private int itemCount;
	public int getItemCount() {
		return itemCount;
	}
	public int getDollarRate() {
		return dollarRate;
	}
	public int getEuroRate() {
		return euroRate;
	}
	public abstract double getCost(int dessertItemCount);
	public abstract void addDessertItem(int dessertItemCount);
}
class Candy extends DessertItem {
	private final double candyCost = 1.2 * super.getDollarRate();
	private final int candyTax = 5;
	private int itemCount = 5;
	public int getItemCount() {
		return itemCount;
	}
	public double getCost(int candyCount) {
		double cost = 0;
		cost += this.candyCost * candyCount + (this.candyTax * this.candyCost)/100;
		return cost;
	}
	public void addDessertItem(int candyCount) {
		this.itemCount += candyCount;
	}
}
class Cookie extends DessertItem {
	private double cookieCost = 1.5 * super.getEuroRate();
	private final int cookieTax = 12;
	private int itemCount = 5;
	public int getItemCount() {
		return itemCount;
	}
	public double getCost(int cookieCount) {
		double cost = 0;
		cost += this.cookieCost * cookieCount + (this.cookieTax * this.cookieCost)/100;
		return cost;
	}
	public void addDessertItem(int cookieCount) {
		this.itemCount += cookieCount;
	}
}
class IceCream extends DessertItem {
	private double iceCreamCost = 70;
	private final int iceCreamTax = 18;
	private int itemCount = 5;
	public int getItemCount() {
		return itemCount;
	}
	public double getCost(int iceCreamCount) {
		double cost = 0;
		cost += this.iceCreamCost * iceCreamCount + (this.iceCreamTax * this.iceCreamCost)/100;
		return cost;
	}
	public void addDessertItem(int iceCreamCount) {
		this.itemCount += iceCreamCount;
	}
}
public class Dessert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DessertItem desitm0, desitm1, desitm2;
		desitm0 = new Candy();
		desitm1 = new Cookie();
		desitm2 = new IceCream();
		Scanner sc = new Scanner(System.in);
		int decide;
		do {
			System.out.println("Enter you are (owner/customer)->(0/1): ");
			int role = sc.nextInt();
			if(role==0) {
				System.out.println("Enter an item that you want to add to the store (Candy, Cookie, IceCream)->(0,1,2): ");
				int item = sc.nextInt();
				if(item==0) {
					System.out.println("Enter how many candies you want to add to the store: ");
					int itemCount = sc.nextInt();
					desitm0.addDessertItem(itemCount);
				}
				else if(item==1) {
					System.out.println("Enter how many cookies you want to add to the store: ");
					int itemCount = sc.nextInt();
					desitm1.addDessertItem(itemCount);
				}
				else if(item==2) {
					System.out.println("Enter how many icecreams you want to add to the store: ");
					int itemCount = sc.nextInt();
					desitm2.addDessertItem(itemCount);
				}
				else {
					System.out.println("Enter a valid choice!");
				}
			}
			else if(role==1){
				System.out.println("Enter an item that you want to buy from the store (Candy, Cookie, IceCream)->(0,1,2): ");
				int item = sc.nextInt();
				if(item==0) {
					System.out.println("Enter how many candies you want to buy: ");
					int itemCount = sc.nextInt();
					if(itemCount <= desitm0.getItemCount()) {
						double cost = desitm0.getCost(itemCount);
						System.out.println("Cost of "+itemCount+" candies is: "+cost);
					}
					else {
						System.out.println(itemCount+" candies are not available! Available count is: "+desitm0.getItemCount());
					}
				}
				else if(item==1) {			
					System.out.println("Enter how many cookies you want to buy: ");
					int itemCount = sc.nextInt();
					if(itemCount <= desitm1.getItemCount()) {
						double cost = desitm1.getCost(itemCount);
						System.out.println("Cost of "+itemCount+" cookies is: "+cost);
					}
					else {
						System.out.println(itemCount+" cookies are not available! Available count is: "+desitm1.getItemCount());
					}
				}
				else if(item==2) {
					System.out.println("Enter how many icecreams you want to buy: ");
					int itemCount = sc.nextInt();
					if(itemCount <= desitm2.getItemCount()) {
						double cost = desitm2.getCost(itemCount);
						System.out.println("Cost of "+itemCount+" icecreams is: "+cost);
					}
					else {
						System.out.println(itemCount+" icecreams are not available! Available count is: "+desitm2.getItemCount());
					}
				}
				else {
					System.out.println("Enter a valid choice!");
				}
			}
			else {
				System.out.println("Enter a valid role!");
			}
			System.out.println("Do you want to continue(yes/no)->(1/0)? ");
			decide = sc.nextInt();
		}while(decide!=0);
		
	}
}


