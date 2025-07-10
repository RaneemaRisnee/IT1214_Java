import java.util.*;

public class Arr{
	public static void main(String []args){
		
		//creating empty ArrayList
		ArrayList <Integer> a1 = new ArrayList <>();

		//use add() method to add elements
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(1);
		a1.add(5);
		a1.add(9);
		
		
		//adding new element at index=2
		a1.add(2,22);
	
		System.out.println(""+a1);
		
		//removing element at index=1
		a1.remove(1);
		System.out.println(""+a1);
		
		//remove element 10 by using object
		a1.remove(Integer.valueOf(10));
		System.out.println(""+a1);
		
		//remove element less than 10
		Iterator itr = a1.iterator(); //creating iterator object 
		
		while(itr.hasNext()){
			int x = (Integer)itr.next();
			System.out.println(x);
			if(x<10)
				itr.remove();
		}
		
		System.out.println(""+a1);
		
		//System.out.println("Printing the elements using enhansed for loop");
		
		
	}
}