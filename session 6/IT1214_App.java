class Student{
	int marks;
	String name;
	
	Student(){
		
		System.out.println("Creating a Student Object");
		name="Default Name"; 
	}
	
	Student(String name,int marks){
		//this.name=name;
		this.marks=marks;
		System.out.println(" ");
		System.out.println("Creating a Student Object");
		System.out.println("The name of the student is: "+name);
		System.out.println("The marks of the student is: "+marks);

	}
	
}

class App{
	public static void main(String [] argsS){
		System.out.println("Welcome to Demo Class App");
		System.out.println(" ");
		
		//default constructor object
		Student ict128 = new Student();
		//before initializing the value to the name and the marks of student ict128.
		System.out.println("The name of the student is: "+ict128.name);
		System.out.println("The marks of the student is: "+ict128.marks);
		//initializing the value to the name and the marks of student ict128.
		ict128.name = "Risnee";
		ict128.marks = 99;
		System.out.println("The name of the student is: "+ict128.name);
		System.out.println("The marks of the student is: "+ict128.marks);

		

		
		//parameterized constructor object
		Student i2 = new Student("Nimbu",55);
		//given name will not diplay. bcz, we did't enable (//this.name=name;) this in parameterized constructor.
		System.out.println("The name of the student is: "+i2.name);
		//given marks will diplay
		System.out.println("The marks of the student is: "+i2.marks);
		
		

	}
}