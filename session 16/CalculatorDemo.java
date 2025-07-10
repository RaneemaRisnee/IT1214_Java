interface Calculator{
	int add(int a,int b);
	int sub(int a,int b);
	int mul(int a,int b);
	float div(int a,int b);
	
}

class MyCalculator implements Calculator{
	/* public void method1(String r){
		System.out.println("From CalculatorRis: "+r);
	} */
	public int add(int a,int b){
		System.out.println("MyCalculator can perform addition operation "+a+" + "+b+" = "+(a+b));
		return a+b;
	}
	public int sub(int a,int b){
		System.out.println("MyCalculator can perform substraction operation "+a+" - "+b+" = "+(a-b));
		return a-b;
	}
	public int mul(int a,int b){
		System.out.println("MyCalculator can perform multiplication operation "+a+" * "+b+" = "+(a*b));
		return a*b;
	}
	public float div(int a,int b){
		System.out.println("MyCalculator can perform division operation "+a+" / "+b+" = "+(a/b));
		return a/b;
	}
 	
}

class CalculatorRis{
	void print(){
		System.out.println("Hi from risnee");
	}
	int addition(int a,int b){
		System.out.println("CalculatorRis can perform addition operation (a+b) with another method name = "+(a+b));
		return a+b;
	}
}

public class CalculatorDemo{
	public static void main(String[] args){
		MyCalculator mc = new MyCalculator();
		CalculatorRis cr = new CalculatorRis();
		
		mc.add(9,3);
		mc.sub(9,3);
		mc.mul(9,3);
		mc.div(9,3);
		
		cr.print();
		cr.addition(5,8);
	}
}