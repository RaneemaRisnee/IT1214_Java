abstract class Shape { // 2D shape
	double area = 100;
	double perimeter = 20;
	abstract double findArea();
}

class Rectangle extends Shape{
	
	double lenght;
	double width;
	
	Rectangle(double lenght,double width){
		this.lenght = lenght;
		this.width = width;
		
	}
	
	double findArea(){
		//super.area =area
		super.area =lenght * width;
		return area;
		
	}
}

class Circle extends Shape{
	double radius;
	Circle (double radius){
		this.radius = radius;
		findArea();
	}
	double findArea(){
		
		//pi = Math.PI =(22/7);
		//radius*radius = Math.pow(radius,2);
		//super.area =area
		super.area =Math.PI*Math.pow(radius,2);
		return area;
	}
}

public class ShapeDemo{
	public static void main(String [] args){
		Rectangle r1 = new Rectangle(10,4);
		System.out.println("Area of Rectangle r1 is "+r1.area);
		System.out.println("Area of Rectangle r1 is "+r1.findArea());
		
		Circle c1 = new Circle(7);
		System.out.println("Area of Circle c1 is "+c1.area);
		System.out.println("Area of Circle c1 is "+c1.findArea());
		System.out.println("Area of Circle c1 is "+c1.area);
	}
}