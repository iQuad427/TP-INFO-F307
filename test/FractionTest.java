import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    static Fraction fraction;

    @BeforeAll
    private static void init() {
        fraction = new Fraction();
    }

    @Test
    private void testValue() {
        fraction.numerateur = 3;
        fraction.denominateur = 8;
        assertEquals(3/8, fraction.getValue());
    }
}