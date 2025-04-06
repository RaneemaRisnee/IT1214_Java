class Student{
	int marks;
	String name;
	
}
//instead of typing "System.out.println" everytime, we can have a class with a method to print that String or integer.
//here i used string only to print 
class Printer{
	
	void print(String s){
		System.out.println(s);
	}
	
}
class App{
	public static void main(String [] argsS){
		
		Printer p = new Printer();
		p.print("Welcome to Demo Class App");
		Student ict128 = new Student();
		
		ict128.name = "cat";
		ict128.marks = 89;
		p.print("The name of the student ict128: "+ict128.name);
		p.print("The marks of the student ict128: "+ict128.marks);

	}
}