import java.util.Scanner;

class BankAccount{
	private String accountHolder; 
	private double balance;
	
	BankAccount(String name){  //constructor
		accountHolder=name;
		balance=1000;
	}
	
	void displayAccountInfo(){
		System.out.println("Account Holder Name: "+accountHolder);
		System.out.println("Account Balance: "+balance);
		
	}
	void deposit(double amount){
		if(amount<0){
			System.out.println("Invalid deposit amount");
		}
		else{
			balance+=amount;
			System.out.println("Your amount Rs. "+amount+" has been deposited to your account.");		
		}
		System.out.println("Your current balance is Rs. "+balance);
	}
}
class BankApp{
	
	public static void main(String[] args){
		
		Scanner ns=new Scanner(System.in);
		Scanner as=new Scanner(System.in);
		
		System.out.println("Enter the account Holder Name : ");
		//String name=ns.nextLine();
		BankAccount ba=new BankAccount(ns.nextLine());
		ba.displayAccountInfo();
		System.out.println("Enter the Deposit amount : ");
		double depositAmount=as.nextDouble();
		ba.deposit(depositAmount);
	}
}