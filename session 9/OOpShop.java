class Item{
	String description;
	int unitPrice;
	
	Item(String desc,int unitPrice){	
		description=desc;
		this.unitPrice=unitPrice;
		
	}
}

class Basket{
	Item itm[5];//having another class's object as a member of another class is called as preposition
	
	void addItem(Item i){
		
	}
	void calculatePrice(){
		
	}
	
}

class ShopDEMO{
	
	public static void main(String [] args){
		Item[] itemList=new Item[10];
		
		Basket basket1 = new basket();
		char input='y';
		int i=0;
		
		do{
			String desc = scan.nextLine();
			int up =scan.nextInt();
			itemList[i]=new Item(desc,up);
			i++;

			
		}while();
	}
}