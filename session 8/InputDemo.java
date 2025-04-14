//import java.util.*; instead of this we can use this. see below
import java.util.Scanner;

class InputDemo{
	public static void main(String [] args){
		String name;
		int  age;
		byte marks;
		char grade;
		Scanner scan = new Scanner(System.in);
		String answer;
		
		System.out.print("Hi! \n Enter your name:  ");
		name = scan.nextLine(); //read string value until press enter key
		System.out.println("Hello "+name+", How are You?");
		answer = scan.nextLine();
		System.out.println("You are "+answer);
		
		System.out.print("Enter your age:  ");
		age = scan.nextInt();
		System.out.println("Ohh god! Are you "+age+" years old?");
		
		System.out.print("Enter your marks:  ");
		marks = scan.nextByte();
		System.out.println("You got "+marks+" marks.");
			
	}
}