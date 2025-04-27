import java.util.Scanner;

class ShopDemo{
	
	static String description[] = {"Bread","Milk Powder","Tooth Paste"};
	static int unitPrice[] = {160,1060,260};
	 
	static int [] itemBasketIndex=new int[3];
	static int [] itemBaketQuantity=new int[3];
	
	
	static void getItems(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Demo Shop");
		System.out.println("Please select your Item by entering the number");
		
		char userOption='y';
		
		do{
			
			for(int i=0;i<description.length;i++){
				System.out.println("Enter "+i+" for "+description[i]);	
			}
			int itemIndex=scan.nextInt();			
			System.out.println("You have chosen "+description[itemIndex]);
			System.out.println("Unit price of "+description[itemIndex]+" is "+unitPrice[itemIndex]);
			
			System.out.println("Enter the Quantity for "+description[itemIndex]);	
			int itemQty=scan.nextInt();			
			System.out.println(description[itemIndex]+" "+itemQty+" * "+unitPrice[itemIndex]+"/- = "+itemQty*unitPrice[itemIndex]+"/- ");
			
			System.out.println("Enter y to continue, press any character to exit");
			Scanner scan1 = new Scanner(System.in);
			userOption=scan1.nextLine().charAt(0);
			//userOption=(char)scan.nextLine();
			
			
		}while(userOption=='y');
			
	}
	
	public static void main(String [] args){
		getItems();
	}
}