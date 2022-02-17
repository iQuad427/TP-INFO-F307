public class Fraction {
    int numerateur;
    int denominateur;

    public int getValue() {
        return numerateur/denominateur;
    }

    public int add(Fraction fraction) {
        return this.getValue() + fraction.getValue();
    }

    public int substract(Fraction fraction) {
        return this.getValue() - fraction.getValue();
    }

    public int product(Fraction fraction) {
        return this.getValue() * fraction.getValue();
    }

    public int divide(Fraction fraction) {
        return (this.numerateur * fraction.denominateur) / (fraction.numerateur * this.denominateur);
    }
}
