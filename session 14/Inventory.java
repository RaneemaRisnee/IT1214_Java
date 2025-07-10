import java.util.*;

class Item{
	private String description;
	private String name;
	private int unitPrice;
	private int quantityAvailable;
	
	public Item(String name, String description, int unitPrice, int quantityAvailable) {
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
        this.quantityAvailable = quantityAvailable;
    }
	
	public void updateQuantity(int amount) {
      
        if (quantityAvailable + amount >= 0) {
            quantityAvailable += amount;
        } else {
            System.out.println("Error: Quantity cannot be negative. Current quantity: " + quantityAvailable);
        }
    }

	 public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Unit Price: Rs " + unitPrice);
        System.out.println("Quantity Available: " + quantityAvailable);
        System.out.println("-------------------------");
    }
	

    public String getName() {return name;}
    public String getDescription() {return description;}
    public int getUnitPrice() {return unitPrice;}
    public int getQuantityAvailable() {return quantityAvailable;}

    public void setDescription(String description) {this.description = description;}
    public void setUnitPrice(int unitPrice) {this.unitPrice = unitPrice;}
    public void setQuantityAvailable(int quantityAvailable) {this.quantityAvailable = quantityAvailable;}
	
	public void addItem(Item item){
		
	}
	public void removeItem(String itemName,int ID){
		
	}
	public void searchItem(String name){
		
	}
	public void updateItemQuantity(String itemName, int amount){
		
	}
	
	
	
}

class Customer{
	String name;
	String contactDetails;
	
	public void addCustomer(Customer customer){
		
	}
	public void removeCustomer(String name){
		
	}
	public void listCustomers(){
		
	}
	public void searchCustomerByName(String name){
		
	}
	
}

class Database{
	ArrayList<Item> item = new ArrayList<>();
	ArrayList<Customer> customer = new ArrayList<>();
	
	
}
class Main{
	
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
        Database database = new Database();

        while (true) {
            System.out.println("------ Inventory Management ------");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Item Quantity");
            System.out.println("4. List All Items");
            System.out.println("5. Add Customer");
            System.out.println("6. List All Customers");
            System.out.println("7. Search Item by Name");
            System.out.println("0. Exit");
            System.out.println("---------------------------------");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
	
		switch(choice){
			case 1 : 
			break;
			case 2 : 
			break;
			case 3 : 
			break;
			case 4 : 
			break;
			case 5 : 
			break;
			case 6 : 
			break;
			case 7 : 
			break;
			case 0 : 
			break;
			default: " ";
			
		}
	}
}

/* ------ Inventory Management ------
1. Add Item
2. Remove Item
3. Update Item Quantity
4. List All Items
5. Add Customer
6. List All Customers
7. Search Item by Name
0. Exit
---------------------------------
Enter your choice  */