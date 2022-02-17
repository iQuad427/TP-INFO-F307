package formes;

public abstract class Forme {
    int length;

    Forme(int length) {
        this.length = length;
    }

    public abstract double perimetre();
    public abstract double aire();
}
