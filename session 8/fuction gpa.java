import java.util.Scanner;

class GPA{
	float gradePoint(String grade){
		float gpv = 0.0f; //grade point value
		String subject;
		int credit;
		
		switch(grade){
			case "A+":gpv=4;break;
			case "A":gpv=4;break;
			case "A-":gpv=3.7f;break;
			case "B+":gpv=3.3f;break;
			case "B":gpv=3;break;
			case "B-":gpv=2.7f;break;
			case "C+":gpv=2.3f;break;
			case "C":gpv=2;break;
			case "C-":gpv=1.7f;break;
			case "D+":gpv=1.3f;break;
			case "D-":gpv=1;break;
			case "E":gpv=0;break;
			default:gpv=1;
		}
		
		
		return gpv;
	}
}

class Demo{
		static Scanner scan = new Scanner(System.in);
		static GPA g = new GPA();
		
		static float getPoint(String subjectcode,int credit){
			System.out.print("Enter the grade for "+subjectcode+" : ");
			String grade = scan.nextLine();
			System.out.println("Grade point Value of the grade "+grade+" is "+g.gradePoint(grade));
			System.out.println("GradePoint * Credit is: "+g.gradePoint(grade)*credit);
			
		return g.gradePoint(grade)*credit;
		
		}
		
	public static void main(String [] args){
		String name;
		float ogp=0;
	
		System.out.print("Enter your name:  ");
		name = scan.nextLine(); 
		System.out.println("Hi! "+name);
		
		ogp+=getPoint("IT1113",3);//read the Grade of IT1113,Get the point value, return the point*credit
		ogp+=getPoint("IT1122",2);
		ogp+=getPoint("IT1134",4);
		ogp+=getPoint("IT1144",4);
		ogp+=getPoint("IT1152",2);


		System.out.print("Final GPA is for Semester 1 is: "+ogp/15);

	}
}