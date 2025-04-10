/*
Type Convertion and Type Casting.

primitive date type
boolean
short
char
long
int 
float
double
String
*/

class ConverterDemo{
	public static void main(String [] args){
		boolean bo = true;
		byte by = 120; //-128 to 127
		short sh = 45;
		char ch = 'b'; //0 to 65535
		long lo = 452L;
		int in = 456;
		float fl = 65.25f;
		double db = 78.25d;
		String st = "Hi";
		
		lo = by; //widening the value or typr conversion 
		sh = (short)lo; //shortning the value and casting it if we are confident with values
		fl = in;
		in =(int)db;
		in = ch;
		ch=100;
		
		in = 99;
		ch = (char)in;
		System.out.println("Value of boolean bo is : "+ bo);
		System.out.println("Value of byte by is : "+ by);
		System.out.println("Value of short sh is : "+ sh);
		System.out.println("Value of char ch is : "+ ch );
		System.out.println("Value of long lo is : "+ lo);
		System.out.println("Value of int in is : "+ in);
		System.out.println("Value of float fl is : "+ fl);
		System.out.println("Value of double db is : "+ db);
		System.out.println("Value of String st is : "+ st);


	}
}
