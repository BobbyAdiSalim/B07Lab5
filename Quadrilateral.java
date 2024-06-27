package lab4;

public class Quadrilateral {
	Point A;
	Point B;
	Point C;
	Point D;
	
	public Quadrilateral(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	
	public Quadrilateral() {
		this.A = new Point(0,0);
		this.B = new Point(0,0);
		this.C = new Point(0,0);
		this.D = new Point(0,0);
	}
	public double perimeter() {
		return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
	}
}
