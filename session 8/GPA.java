import java.util.Scanner;

class GPA{
	float gradePoint(String grade){
		float gpv = 0.0f; //grade point value
		
		/*if(grade.equals("A+") ||grade.equals("A")){
			gpv=4;
		}else if(grade.equals("A-")){
			gpv=3.7;
		}else if(grade.equals("B+")){
			gpv=3.3;
		}else if(grade.equals("B")){
			gpv=3;
		}else if(grade.equals("B-")){
			gpv=2.7;
		}else if(grade.equals("C+")){
			gpv=2.3;
		}else if(grade.equals("C")){
			gpv=2;
		}else if(grade.equals("C-")){
			gpv=1.7;
		}else if(grade.equals("D+")){
			gpv=1.3;
		}else if(grade.equals("D")){
			gpv=1;
		}else if(grade.equals("E")){
			gpv=0;
		}
		*/
		
		switch(grade){
			case "A+":
			gpv=4;
			break;
			case "A":
			gpv=4;
			break;
			case "A-":
			gpv=3.7f;
			break;
			case "B+":
			gpv=3.3f;
			break;
			case "B":
			gpv=3;
			break;
			case "B-":
			gpv=2.7f;
			break;
			case "C+":
			gpv=2.3f;
			break;
			case "C":
			gpv=2;
			break;
			case "C-":
			gpv=1.7f;
			break;
			case "D+":
			gpv=1.3f;
			break;
			case "D-":
			gpv=1;
			break;
			case "E":
			gpv=0;
			break;
			default:
			gpv=1;
			
		}
		
		return gpv;
	}
}

class Demo{
	public static void main(String [] args){
		String name;
		float ogp;
		String grade;
		float point;
		
		Scanner scan = new Scanner(System.in);
		GPA g = new GPA();
		
		System.out.print("Enter your name:  ");
		name = scan.nextLine(); 
		System.out.println("Hi! "+name);
		System.out.println();
		
		System.out.print("Enter the grade for IT1113: ");
		grade = scan.nextLine();
		point = g.gradePoint(grade);
		ogp=point*3;
		System.out.println("Grade point Value of the grade "+grade+" is "+point);
		System.out.println("Overall Grade point: "+ogp);
		System.out.println();

		System.out.print("Enter the grade for IT1122: ");
		grade = scan.nextLine();
		point = g.gradePoint(grade);
		ogp=ogp+point*2;
		System.out.println("Grade point Value of the grade "+grade+" is "+point);
		System.out.println("Overall Grade point: "+ogp);
		System.out.println();

		System.out.print("Enter the grade for IT1134: ");
		grade = scan.nextLine();
		point = g.gradePoint(grade);
		ogp=ogp+point*4;
		System.out.println("Grade point Value of the grade "+grade+" is "+point);
		System.out.println("Overall Grade point: "+ogp);
		System.out.println();

		
		System.out.print("Enter the grade for IT1144: ");
		grade = scan.nextLine();
		point = g.gradePoint(grade);
		ogp=ogp+point*4;
		System.out.println("Grade point Value of the grade "+grade+" is "+point);
		System.out.println("Overall Grade point: "+ogp);
		System.out.println();

		System.out.print("Enter the grade for IT1152: ");
		grade = scan.nextLine();
		point = g.gradePoint(grade);
		ogp=ogp+point*2;
		System.out.println("Grade point Value of the grade "+grade+" is "+point);
		System.out.println("Overall Grade point: "+ogp);

		System.out.println();
		System.out.println("Final GPA is for Semester 1 is: "+ogp/15);

	}
}