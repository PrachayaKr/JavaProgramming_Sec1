
public class Circle {
    //the public constants
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "red";
	
	//define 2 private attribute
	private double radius;
	private String color;
	
	//Default Constructor
	Circle(){
		radius = DEFAULT_RADIUS;
		color = DEFAULT_COLOR;
	}
	// Constructor 2
	Circle (double radius){
	    this.radius = radius;
	    this.color = DEFAULT_COLOR;
	}
	//Constructor 3
	Circle(double radius,String color){
		this.color = color;
		this.radius = radius;
	}
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String toString() {
		return "Circle[radius= "+radius+",color=" +color+"]";
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	public double getCircumference() {
		return 2.0*Math.PI*radius;
	}
}
