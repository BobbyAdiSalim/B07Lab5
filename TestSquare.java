package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestSquare {
    
    @Test
    void testDefaultConstructor() {
        Square s = new Square();
        assertNotNull(s);
    }

    @Test
    void testConstructor() {
        Point p = new Point(4, 3);
        Square s = new Square(p, 1);
        assertNotNull(s);
    }
    
    @Test
    void testArea() {
        Point p = new Point(4, 3);
        Square s = new Square(p, 2);
        assertEquals(s.area(), 4);
    }
    
    @Test
    void testPerim() {
        Point p = new Point(4, 3);
        Square s = new Square(p, 4);
        assertEquals(s.area(), 16);
    }
    
    @Test
    void testCenter() {
        Point p = new Point(4, 3);
        Square s = new Square(p, 4);
        assertEquals(s.center(), new Point(6, 5));
    }
    
}
