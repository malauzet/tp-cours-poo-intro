package fichier;

public class Ville implements Comparable<Ville> {

    private final String nom;
    private final String codeDep;
    private final String nomRegion;
    private final int population;

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

    @Override
    public int compareTo(Ville autre) {
        //return this.nom.compareTo(autre.nom);
        return Integer.compare(this.population, autre.population);
    }
}
