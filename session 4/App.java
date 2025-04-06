import a.*;
import b.*;

class App{
	public static void main (String [] args){
		a.Test t1 = new a.Test();
		b.Test t2 = new b.Test();
		
		//t1.print();
		t2.print();
		
		//Expected output when both test classes from a and  b pakages are public
		/* 
			Hi from class Test in Package a
			Hi from class Test in Package b
		*/
		
		// if classes from imported packages are not public, then it won't work in main class
		
		t1.display();
		//Expected output 
		/* 
			Hi from class Test in Package b
		*/
	}

}