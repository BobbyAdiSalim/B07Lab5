public class Square extends Point{
	Point bot_left;
	double length;
	public Square(){
		this.bot_left = new Point();
		this.length = 0;
	}
	public Square(Point x1, doube len){
		this.bot_left = x1;
		this.length = len;
	}
	
	public double area(){
		double store = this.length;
		return store * store;
	}
	
	public double perim(){
		return 4 * this.length;
	}
	
	public Point center(){
		Point nnew;
		nnew = new Point(this.bot_left.x+this.length/2, this.bot_left.y+this.length/2);
		return nnew;
	}
}