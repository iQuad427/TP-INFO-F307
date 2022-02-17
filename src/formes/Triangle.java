package formes;

import static java.lang.Math.*;

public class Triangle extends Forme {

    public Triangle(int length) {
        super(length);
    }

    public double perimetre() {
        return 3 * this.length;
    }

    public double aire() {
        return (this.length * this.length * sqrt(3)/2)/2;
    }
}
