package formes;

public class Carre extends Forme {

    public Carre(int length) {
        super(length);
    }

    public double perimetre() {
        return 4 * this.length;
    }

    public double aire() {
        return this.length * this.length;
    }
}
