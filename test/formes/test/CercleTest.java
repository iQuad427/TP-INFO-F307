package formes.test;

import formes.Cercle;
import org.junit.jupiter.api.*;

import static java.lang.Math.*;
import static org.junit.jupiter.api.Assertions.*;

class CercleTest {

    public static Cercle cercle1;
    public static Cercle cercle2;

    @BeforeAll
    public static void init() {
        cercle1 = new Cercle(4);
        cercle2 = new Cercle(5);
    }

    @Test
    public void testPerimetre() {
        assertEquals(PI*2*4, cercle1.perimetre());
        assertEquals(PI*2*5, cercle2.perimetre());
    }

    @Test
    public void testAire() {
        assertEquals(PI*16, cercle1.aire());
        assertEquals(PI*25, cercle2.aire());
    }
}