import java.util.*;
class Product{
	private String name;
	private int unitPrice;
	
	Product(String name,int price){
		this.name = name;
		this.unitPrice = price;
	}
	public String getName(){ return name;}
	public int getUnitPrice(){return unitPrice;}
	
}

class BillEntry{
	Product product;
	int quantity;
	
	BillEntry(Product pro,int qty){
		this.product = pro;
		this.quantity = qty;
	}
	int getTotal(){
		return product.getUnitPrice()*quantity;
	}
	
}
class Bill{
	List <BillEntry> billEntries = new ArrayList<>();
	int grandTotal=0;
	
	void addEntry(BillEntry entry){
			billEntries.add(entry);
			grandTotal += entry.getTotal();
		}
	void getEntries(BillEntry be){
		for(BillEntry entry: billEntries){
			System.out.println(entry.product.getName()+" X "+entry.quantity+" = "+entry.getTotal());
		}
	}
	/* int getGrandTotal(){
		for(BillEntry entry: billEntries){
			System.out.println(entry.product.getName()+" X "+entry.quantity+" = "+(entry.getTotal());
		}
	}
	 */
	
}
class BillDemo{
	static void print(String s){
		System.out.println(s);
	}
	/* type_1 usecase
	static void printProductDetail(Product p){
		System.out.println("Name: " +p.getName()+"UnitPrice: "+p.getUnitPrice());
	}*/
	public static void main(String [] args){
		print("Welcome to Demo Shop");
		Product milk = new Product("Diamond",140);
		Product bread = new Product("Prima",160);
		
		print("Entering new Bill Entry");
		BillEntry be1 = new BillEntry(milk,10);
		/* 
		Bill b = new Bill();
		b.addEntry(be1);
		b.addEntry(new BillEntry(bread,5));
		b.addEntry(new BillEntry(new Product("Sugar",250),3));
		print("Printing Bill!");
		b.printBill();
		
		 */
		
		
	}
}