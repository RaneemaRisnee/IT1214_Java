interface A{
	void method1(String a);
	void method2();
	void method3(int a);

}

class C implements A{
	public void method1(String r){
		System.out.println("From C: "+r);
	}
 	public void method2(){
		System.out.println("method2");

	}
	public void method3(int r){
		System.out.println(r);
	} 
}

public class InterfaceDemo{
	public static void main(String[] args){
		C obc = new C();
		obc.method1("abc");
		obc.method2();
		obc.method3(3);
	}
}