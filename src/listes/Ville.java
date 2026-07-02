package listes;

public class Ville {

    private String nom;
    private final int nbHabitants;
    private Continent continent;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public Ville(String nom, int nbHabitants, Continent continent) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.continent = continent;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {

        if (continent != null) {
            return "{" + nom + ", " + nbHabitants + ", " + continent.getLibelle() + "}";
        }
        return "{" + nom + ", " + nbHabitants + "}";
    }
}
