import java.util.*;

class FindSum{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		
		int sum =0;
		
		System.out.println("Enter 10 integer values: ");
			
				for(int i=0;i<10;i++){
					System.out.print("Interger "+(i+1)+" : ");
					try{
			
					sum+=Integer.parseInt(scan.nextLine());
				
				}catch(Exception e){
				System.out.println(e.getMessage());
				i=i-1;
				}}
		System.out.println("The Sum of 10 numbers: "+sum);
		
		}
		
		
	}