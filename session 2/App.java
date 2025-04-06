//import p1.MyClass;
import p1.*;
//import p1.p3.Class4;
import p1.p3.*;

//import p2.Class2;
//import p2.Class3;
import p2.*;

// always package name should be the name of the folder
class App{
	public static void main(String [] ar){
		MyClass mc = new MyClass();
		mc.display();
		
		Class2 c2 = new Class2();
		c2.display();
		
		Class3 c3 = new Class3();
		c3.display();
		
		Class4 c4 = new Class4();
		c4.display();
		
	} 
}