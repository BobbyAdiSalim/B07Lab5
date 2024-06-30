package lab4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCircle {
	
	private static final double ERR = 0.000001;

	@Test
	public void testCircleArea() {
		Point a = new Point(0, 0);
		Circle circ = new Circle(a, 1);
		assertEquals(circ.area(), Math.PI, ERR);
	}

	@Test
	public void testCircleCircumference() {
		Point a = new Point(0, 0);
		Circle circ = new Circle(a, 0.5);
		assertEquals(circ.circumference(), Math.PI, ERR);
	}
	
}
