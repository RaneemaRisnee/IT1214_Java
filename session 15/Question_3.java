/* Write a java program  using Arraylist to manage list of product prices.
1. Accept prices of 7 products from the user and store them in an 
	ArrayList<Double>
2. Display all the prices.
3. Count and display how many products cost more than 100.
4. Increase each price by 10% and display updated list. 
5. Remove any product priced above 500 after the increase and 
	display the final list.
*/
import java.util.*;

public class Question_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		ArrayList<Double> prices = new ArrayList<>();
		
		//Accept prices of 7 products.
			System.out.println("Enter prices of 7 products.");
			for(int i=0;i<7;i++){ //auto boxing 
				System.out.print("Enter price of product "+(i+1)+": ");
				double price = scanner.nextDouble();
				prices.add(price);
			}
		
		//Display all the prices.
			System.out.print("\nThe Price List: ");
			System.out.println(prices);
				
		//Count and display how many products cost more than 100.
			int count=0;
			for(double price: prices){
				if(price>100){
					count++;
				}
			}
			System.out.print("No of products cost more than 100: " +count+" \n");
			
		//Increasing each price by 10% and display updated list	
			for(int i=0;i<prices.size();i++){
				double updatedprice = prices.get(i)*1.10;
				//double updatedprice = prices.get(i)+(prices.get(i)*0.10);
				prices.set(i,updatedprice);
			}
			
			System.out.print("Updated Price list: "+prices);
			
		//Remove any product priced above 500 after the increase and display the final list	
			/* for(int i=prices.size()-1;i>=0;i--){
				if(prices.get(i)>500){
					price.remove(i);
				}
			}
			 */
			
			Iterator<Double> iterator = prices.iterator();
			while(iterator.hasNext()){
				double price = iterator.next();
				if(price>500){
					iterator.remove();
				}
			}
			System.out.print("Final Price list after removing: "+prices+" \n"); 
			scanner.close();  
	}
}