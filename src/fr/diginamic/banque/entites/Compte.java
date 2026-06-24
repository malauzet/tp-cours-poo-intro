package fr.diginamic.banque.entites;

public class Compte {

    private int numCompte;
    private double soldeCompte;

    // Getters -----------------------------------------------------------------------------------------
    public int getNumCompte() {
        return numCompte;
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    // Setters -----------------------------------------------------------------------------------------
    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public void setSoldeCompte(double soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    // Constructeur ------------------------------------------------------------------------------------
    public Compte(int numCompte, double soldeCompte) {
        this.numCompte = numCompte;
        this.soldeCompte = soldeCompte;
    }
}
