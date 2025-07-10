/* Write a java program  using Arraylist to manage a list of Student names.
1. Accept 5 student names from the user and stire them in an ArrayList<String>
2. Display all the students name.
3. Ask the user to enter a name to search(use method contain). if found,display the position
	if not found display the message "Student not found"
4. Ask the user to enter a name to remove from the list. After remove display the updated list. 	 */

import java.util.ArrayList;
import java.util.Scanner;


	
public class Question {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		ArrayList<String> student = new ArrayList<>();
		
		//Accept 5 Student Names.
		System.out.println("Enter 5 Student names.");
		for(int i=0;i<5;i++){
			String name = scanner.nextLine();
			student.add(name);
		}
		
		//Display all the Student Names.
		System.out.println("Student List: ");
		System.out.println(student);
			
		//Search for a Name.
		System.out.println("Enter a Name to search: ");
		String searchname = scanner.nextLine();
		
		if(student.contains(searchname)){
			int index = student.indexOf(searchname);
			System.out.println(searchname+" found at "+index);
			
		}else{
			System.out.println(searchname+" not found!");
		}
		
		//Remove a Name.
		System.out.println("Enter a Name to remove: ");
		String removename = scanner.nextLine();
		
		if(student.remove(removename)){
			System.out.println("updated Student list:");
			System.out.println(student);
			
		}else{
			System.out.println(removename+" not found!");
		}
	}
}