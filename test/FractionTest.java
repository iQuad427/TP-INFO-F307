import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    static Fraction fraction1;
    static Fraction fraction2;
    static Fraction fraction3;
    static Fraction fraction4;

    @BeforeAll
    public static void init() {
        fraction1 = new Fraction();
        fraction1.numerateur = 1;
        fraction1.denominateur = 4;

        fraction2 = new Fraction();
        fraction2.numerateur = 2;
        fraction2.denominateur = 5;

        fraction3 = new Fraction();
        fraction3.numerateur = 4;
        fraction3.denominateur = 9;

        fraction4 = new Fraction();
        fraction4.numerateur = 4;
        fraction4.denominateur = 8;
    }

    @BeforeEach
    public void resetFraction() {}

    @Test
    public void testValue() {
        assertEquals(1/4, fraction1.getValue());
        assertEquals(2/5, fraction2.getValue());
        assertEquals(4/9, fraction3.getValue());
    }

    @Test
    public void testAdd() {
        assertEquals(13/20, fraction1.add(fraction2));
        assertEquals(13/20, fraction2.add(fraction1));
        assertEquals(38/45, fraction2.add(fraction3));
        assertEquals(25/36, fraction3.add(fraction1));
    }

    @Test
    public void testSubstract() {
        assertEquals(-3/20, fraction1.substract(fraction2));
        assertEquals(-2/45, fraction2.substract(fraction3));
        assertEquals(7/36, fraction3.substract(fraction1));
    }

    @Test
    public void testProduct() {
        assertEquals(1/10, fraction1.product(fraction2));
    }

    @Test
    public void testDivide() {
        assertEquals(5/8, fraction1.divide(fraction2));
    }

    @Test
    public void testReduction() {
        assertEquals(1/2, fraction4.getValue());
    }
}