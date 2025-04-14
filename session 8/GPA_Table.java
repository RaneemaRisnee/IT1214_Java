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
		//class variables
		static String name;
		static String[] subjects={"IT1113","IT1122","IT1134","IT1144","IT1152"};
		static int[] credits={3,2,4,4,2};
		static String[] grades=new String[5];
		static float[] gps=new float[5];
		
		//method
		static float getPoint(int index){
			System.out.print("Enter the grade for "+subjects[index]+" : ");
			grades[index] = scan.nextLine();
			gps[index]= g.gradePoint(grades[index])*credits[index];
			
		return gps[index];
		
		}
		
	public static void main(String [] args){
		
		float ogp=0;
	
		System.out.print("Enter your name:  ");
		name = scan.nextLine(); 
		
		for(int i=0;i<5;i++){
			ogp+=getPoint(subjects[i],credits[i]);
		}
		grades[index] = scan.nextLine(); 
		
		for(int i=0;i<5;i++){
			
		System.out.println("Name: "+name);
		System.out.println("----------------------------------------------");
		System.out.println("Subject |\t Grade |\t Grade Point |");
		System.out.println("----------------------------------------------");
		System.out.println(subjects[index] +"|\t"+credits[index]+"|\t"+grade[index]+"|\t");
		System.out.println("----------------------------------------------");
		
		System.out.println("Overall Grade point Value: "+gps[index]*credits[index]);
		System.out.println("Grade Point Average: "+ogp/15);
			
		System.out.println("----------------------------------------------");
		}
	}
}