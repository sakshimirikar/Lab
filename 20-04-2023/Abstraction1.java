package Lab;


abstract class Shape{
	
	abstract double calculateArea();

	
}

class Circle extends Shape{
	
	double r;
	
	//Constructor
	public Circle(double r) {
		this.r=r;
		
	}
	
	@Override
	double calculateArea() {
		double area = 3.14 *r*r;
		return area;
		
		
	}

	
	
}

class Rectangle extends Shape{
	
	double l ,b;
	
	//Constructor
	public Rectangle(double l , double b) {
		this.l=l;
		this.b=b;
	}
	

	@Override
	double calculateArea() {
		
		double area = l*b;
		return area;
	}
}


public class Abstraction1 {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(2);
		System.out.println("Area of Circle : " + c1.calculateArea());
		
		Rectangle r1 = new Rectangle(2,3);
		System.out.println("Area of Rectangle : " + r1.calculateArea());
		

	}

}
