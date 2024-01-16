
public class TestCircle {

	public static void main(String[] args) {
		//test all constructors and toString()
		
		//use constructors 3
		Circle c1 = new Circle(1.1,"blue");
		System.out.println(c1);
		
		//use constructors 2
		Circle c2 = new Circle(2.2);
		System.out.println(c2);
		
		//use constructors 1 or default
		Circle c3 = new Circle();
		System.out.println(c3);
        
		
		//test setters and getter method
		c1.setRadius(3.3);
		c1.setColor("green");
		System.out.println("The radius is: "+c1.getRadius());
		System.out.println("The color is: "+c1.getColor());
		
		//Test getArea() and getCircumference
		System.out.printf("the area is: %2f%n",c1.getArea());
		System.out.printf("The circumference is: %.2f",c1.getCircumference());
		
	}

}
