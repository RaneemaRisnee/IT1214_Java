
import it.*;
import it.hons.*;
import amc.*;

// always package name should be the name of the folder

class App{
	public static void main(String [] ar){
		it.FirstYear itFirst = new it.FirstYear();
		amc.FirstYear amc1 = new amc.FirstYear();
		SecondYear amc2 = new SecondYear();
		FourthYear itHons = new FourthYear();
		
		itFirst.display();
		amc1.display();
		amc2.display();
		itHons.display();
		

		
	} 
}