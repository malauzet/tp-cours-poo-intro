package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{

    private double taux;

    // Constructeur ------------------------------------------------------------------------------------
    public CompteTaux(int numCompte, double soldeCompte, double taux) {
        super(numCompte, soldeCompte);
        this.taux = taux;
    }

    // Getters -----------------------------------------------------------------------------------------
    public double getTaux() {
        return taux;
    }

    // Setters -----------------------------------------------------------------------------------------
    public void setTaux(double taux) {
        this.taux = taux;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nTaux de rémunération : " + taux + "%";
    }
}
