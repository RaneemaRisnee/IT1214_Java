//Write a java program to create a car class with private field model.
//provide a getter and setter method for the model.
//In the main class, create an object of car,
//set the model name to"Toyota Corolla" and  print it.


 class Car{
	private String model;
	

	//getter
	public String getModel(){
		return model;
	 }
	//setter
	public void setModel(String model){
		this.model=model;
	 }
	 
	
}



	public class Main1{
		 public static void main(String args[]){
			 
			 Car c1 = new Car();
			
			 c1.setModel("Toyota Corolla");
			 
			 System.out.println(c1.getModel());
			
		 }
	 }
	 
	 