package geometrie;

public class Rectangle implements ObjetGeometrique {

    private double largeur;
    private double longueur;

    // Constructor --------------------------------------------------------------------------
    public Rectangle(double largeur, double longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    // Getters et Setters -------------------------------------------------------------------
    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    // Methodes -----------------------------------------------------------------------------
    @Override
    public double perimetre() {
        return (largeur + longueur) * 2;
    }

    @Override
    public double surface() {
        return largeur * longueur;
    }
}
