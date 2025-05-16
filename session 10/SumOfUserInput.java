import java.util.Scanner;

class Main{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		
		int [] number = new int[10];
		int sum =0;
		
		System.out.println("Enter 10 integer values: ");
			try{
				for(int i=0;i<10;i++){
					System.out.print("Interger "+(i+1)+" : ");
					number[i] = scan.nextInt();
					sum+=number[i];
				
				}
			}catch(Exception e){
				System.out.println("Exception Error! Enter Integer Value!");
				//i =i-1;
			}
		System.out.println("The Sum of 10 numbers: "+sum);
		
		}
		
		
	}