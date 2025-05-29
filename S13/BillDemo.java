//ctrl + Shift +Q = to comment set of code
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
	
	public void setUnitPrice(int newPrice){unitPrice = newPrice;}
	
	//type_2
	public void printProductDetail(){
		System.out.println("Name: " +name+" UnitPrice: "+unitPrice);
	}
	
}
class BillEntry{
	Product product;
	int quantity; //number of units,
	
	BillEntry(Product p,int qty){
		this.product = p;
		this.quantity = qty;
	}
	void printBillEntry(){
		System.out.println("Product Name: "+product.getName()+" Unit Price: "+product.getUnitPrice()+" Number of units: "+quantity+" Total Price: "+(product.getUnitPrice()*quantity));
	}
	//to calculate sum of total amount in bill (need to implement fully)
	/* List <Product> product = new ArrayList<>();
	Iterator itr = product.iterator(); //creating iterator object 
		
		while(itr.hasNext()){
			int x = (Integer)itr.next();
			
			int sum =0;
			sum += x;
		}
		
		System.out.println(""+product); */
	
}
class Bill{
	List <BillEntry> billEntries = new ArrayList<>();
	
	void addEntry(BillEntry be){
		billEntries.add(be);
	}
	
	void printBill(){
		for(BillEntry e: billEntries){
			System.out.println("Product: "+e.product.getName()+" X "+e.quantity+" = "+(e.product.getUnitPrice()*e.quantity));
		}
	}
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
		print("");
		print("Endering Products");
		
		Product milk = new Product("Diamond",140);
		//--//print("Successfully Added!");
		/* type_1 usecase
		printProductDetail(milk);*/
		//--//milk.printProductDetail();// type_1 usecase
		
		Product bread = new Product("Prima",160);
		//--//print("Successfully Added!");
		/* type_1 usecase
		printProductDetail(bread); */
		//--//bread.printProductDetail();// type_1 usecase
		
		//--//bread.setUnitPrice(165);
		//--//print("Successfully Changed unitPrice!");
		/* type_1 usecase
		printProductDetail(bread);*/
		bread.printProductDetail();// type_1 usecase
		print("");
		
		print("Entering new Bill Entry");
		BillEntry be1 = new BillEntry(milk,10);
		//be1.printBillEntry();
		
		Bill b = new Bill();
		b.addEntry(be1);
		b.addEntry(new BillEntry(bread,5));
		b.addEntry(new BillEntry(new Product("Sugar",250),3));
		print("Printing Bill!");
		b.printBill();
		
		
		
		
	}
}