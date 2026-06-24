package geometrie;

public class Cercle implements ObjetGeometrique {

    private double rayon;

    // Constructor --------------------------------------------------------------------------
    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    // Getters et Setters -------------------------------------------------------------------
    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    // Methodes -----------------------------------------------------------------------------
    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }
}
