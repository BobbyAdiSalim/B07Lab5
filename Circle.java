public class Circle {
	Point Center;
	double radius;
	
	public Circle(Point Center, double radius) {
		this.Center = Center;
		this.radius = radius;
	}
	
	public double area(){
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double circumference() {
		return 2 * Math.PI * radius;
	}

}