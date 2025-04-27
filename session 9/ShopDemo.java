import java.util.Scanner;

class ShopDemo{
	
	static String description[] = {"Bread (500g)","Milk Powder","Tooth Paste"};
	static int unitPrice[] = {160,1060,260};
	 
	static byte [] itemBasketIndex=new byte[3];
	static int [] itemBasketQuantity=new int[3];
	static int basketIndex=0;
	static int [] total=new int[3];
	
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
			
			System.out.println("Enter the Quantity");
			int numberOfUnits=scan.nextInt();
			
			itemBasketIndex[basketIndex]=(byte) itemIndex;
			itemBasketQuantity[basketIndex]=numberOfUnits;
			basketIndex++;
			
			System.out.println("Enter y to continue, press any character to exit");
			Scanner scan1 = new Scanner(System.in);
			userOption=scan1.nextLine().charAt(0);
			//userOption=(char)scan.nextLine();
			
			
		}while(userOption=='y' && basketIndex<3);
			showbasket();
	}
	
	static void showbasket(){
		System.out.println("No \t Item \t\t Unit Price \t Quantity \t Price ");
		for(int i=0;i<basketIndex;i++){
			
			int x = unitPrice[itemBasketIndex[i]]*itemBasketQuantity[i];
			
			System.out.println(i+1+" \t "+
								description[itemBasketIndex[i]]+" \t "+
								unitPrice[itemBasketIndex[i]]+".00"+" \t "+
								itemBasketQuantity[i]+" \t\t "+x+".00");
								
			total[i]+=total[i];
			}
			System.out.println("----------------------------------------------------------------------");
		
			
			System.out.println("Total: \t \t \t \t \t "+total[i]);
	}
	
	public static void main(String [] args){
		getItems();
		
	}
}