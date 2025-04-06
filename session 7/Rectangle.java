class Rectangle{
	
	//private int height;
	int width;
	int height;
	Rectangle(){
		height=2;
		width=2;
	}
	//void get_details(){
		//System.out.println("Height "+height+" , width "+width);
	//}
	Rectangle(int h,int w){
		height=h; // otherwise use like this this.height=height
		width=w;
		System.out.println();
		System.out.println("Just created a rectangle object with size (h*w) = "+height+"*"+width);
		print(width,height);

	}
	
	
	void print ( int width,int height){
		//height= no of lines 
		for(int i=0;i<height;i++){
			
			//width= no of Stars in a line
			for(int j=0;j<width;j++){
			System.out.print("*");
		}
			System.out.println(); //break lines
			
		}
	}
	
}

class Main{
	public static void main(String [] args){
		/*
		for(int i=0;i<10;i++){
			System.out.println("The value of i is "+i);
			
		}
		*/
		
		Rectangle r1 = new Rectangle(10,6);
		System.out.println();
		r1.print(3,4);
		//hint u may use nested for loops and print,println
		/* expected out put
			***
			***
			***
			***
		*/
		System.out.println();
		r1.print(5,4);
		/* expected out put
			*****
			*****
			*****
			*****
		*/
		
		System.out.println();
		Rectangle r2 = new Rectangle(8,8);
		Rectangle r3 = r1; 
		
			System.out.println("Height "+r1.height+" , width "+r1.width);
			System.out.println("Height "+r2.height+" , width "+r2.width);
			System.out.println("Height "+r3.height+" , width "+r3.width);
			
			//r1.get_details();
		Rectangle r4 = new Rectangle();
		System.out.println("Height "+r4.height+" , width "+r4.width);
			// scanner to input mnvalues when running ----next class
	}
}