package formes.test;

import formes.Triangle;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static java.lang.Math.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    public static Triangle triangle1;
    public static Triangle triangle2;

    @BeforeAll
    public static void init() {
        triangle1 = new Triangle(4);
        triangle2 = new Triangle(5);
    }

    @Test
    public void testPerimetre() {
        assertEquals(12, triangle1.perimetre());
        assertEquals(15, triangle2.perimetre());
    }

    @Test
    public void testAire() {
        assertEquals(4*sqrt(3), triangle1.aire());
        assertEquals(25*sqrt(3)/4, triangle2.aire());
    }
}