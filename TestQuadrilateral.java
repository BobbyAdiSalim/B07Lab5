package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestQuadrilateral {

	@Test
	void testQuadrilateralDefaultPerimeter() {
		Quadrilateral quad = new Quadrilateral();
		assertEquals(quad.perimeter(), 0);
	}
	
	@Test
	void testQuadrilateralConstructedPerimeter() {
		
		Quadrilateral quad = new Quadrilateral(new Point(0,0),new Point(0,1), new Point(1,1), new Point(1,0));
		assertEquals(quad.perimeter(), 4);
	}
}
