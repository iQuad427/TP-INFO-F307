package formes;

import static java.lang.Math.PI;

public class Cercle extends Forme {

    public Cercle(int length) {
        super(length);
    }

    public double perimetre() {
        return 2 * PI * length;
    }

    public double aire() {
        return PI * this.length * this.length;
    }
}
