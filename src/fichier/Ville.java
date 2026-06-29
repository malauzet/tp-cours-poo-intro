package fichier;

public class Ville {

    private String nom;
    private String codeDep;
    private String nomRegion;
    private int population;

    public Ville(String nom, String codeDep, String nomRegion, int population) {
        this.nom = nom;
        this.codeDep = codeDep;
        this.nomRegion = nomRegion;
        this.population = population;
    }

    public String getCodeDep() {
        return codeDep;
    }

    public String getNom() {
        return nom;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return nom + ", " + codeDep + ", " + nomRegion + ", " + population;
    }
}
