class Student{
	String name="Risnee";
	int marks=100;
	
	Student(){
		name="NoName";
	 }
	 
	 Student(String n){
		name=n;
	 }
	 
	 Student(String n, int m){
		name=n;
		marks=m;
	 }
}

	class TestClass{
		int a;
		
		public static void main(String []args){
			 System.out.println("Hi From TestClass Class");
	}}
	
	 class StudentDemo{
		 public static void main(String []args){
			 System.out.println("Hi From StudentDemo Class");
			 System.out.println("Creating an object of Student Class");
			 
			 //created an object called s1 for student.
			 Student s1 = new Student("Nice Name",85);
			 System.out.println("Created an object of Student Class");
			 
			 System.out.println("Name value of the subject is "+s1.name);
			 System.out.println("Marks value of the subject is "+ s1.marks);
			 s1.name="Kuchchi";
			 s1.marks=91;
			 System.out.println("Name value of the subject is "+s1.name);
			 System.out.println("Marks value of the subject is "+ s1.marks);
			
		 }
	 }
	 