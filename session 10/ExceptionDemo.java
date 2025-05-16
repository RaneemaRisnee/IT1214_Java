class ExceptionDemo{
	public static void main(String []args){
		
		System.out.println("Start of the program");
		int a = 10;
		int b = 1;
		
		try{
			int c = a/b;
			//if b=0 ---->The Error is / by zero
			
			//int d = 'g';
			int d = Integer.parseInt(args[0]);
			//The Error is Index 0 out of bounds for length 0
		}
		catch(Exception e ){
			System.out.println("An Error Occured!");
			System.out.println("The Error is "+ e.getMessage());
		}
		
		System.out.println("End of the program");
		
	}
	
}