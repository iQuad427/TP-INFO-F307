package formes.test;

import formes.Carre;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CarreTest {

    public static Carre carre1;
    public static Carre carre2;

    @BeforeAll
    public static void init() {
        carre1 = new Carre(4);
        carre2 = new Carre(5);
    }

    @Test
    public void testPerimetre() {
        assertEquals(16, carre1.perimetre());
        assertEquals(20, carre2.perimetre());
    }

    @Test
    public void testAire() {
        assertEquals(16, carre1.aire());
        assertEquals(25, carre2.aire());
    }
}