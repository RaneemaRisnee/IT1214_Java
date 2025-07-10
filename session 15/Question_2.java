/* Write a java program  using Arraylist to manage marks of Students.
1. Accept 10 student marks from the user and store them in an ArrayList<Integer>
2. Display all the student marks.
3. Calculate and display average.
4. Display the highest and lowest marks 
5. Remove any marks less than 40 and display updated list*/

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;
	
public class Question_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> marks = new ArrayList<>();
		
		//Accept 10 Student marks.
			System.out.println("Enter 10 Student marks.");
			for(int i=0;i<10;i++){ //auto boxing 
				System.out.print("Enter mark"+(i+1)+": ");
				int mark = scanner.nextInt();
				marks.add(mark);
			}
		
		//Display all the Student marks.
			System.out.print("\nStudent marks List: ");
			System.out.println(marks);
				
		//Calculate and display the average
			int sum=0;
			double average=0.0;
			
			for (int m : marks) /* for loop for each elements of array "marks". 
								Here i took m to temporirily store that array's element. */	
			{
				sum +=m;
				average = ((double)sum/(marks.size()));
			}
			System.out.println("Sum: "+sum);
			System.out.println("Average: "+average);
		
		//Display the highest and lowest marks 
			int highest = Collections.max(marks);
			int smallest = Collections.min(marks);
			System.out.println("Highest mark: "+highest);
			System.out.println("Smallest mark: "+smallest);
		
		//Remove Marks.
			Iterator<Integer> iterator = marks.iterator();
			while(iterator.hasNext()){
				int mark = iterator.next();
				if(mark<40){
					iterator.remove();
				}
			}
			System.out.print("Updated Marks List: " +marks+" \n");
			scanner.close();  
	}
}