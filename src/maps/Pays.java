package maps;

public class Pays {

    private String nom;
    private int population;
    private String continent;

    public Pays(String nom, int population, String continent) {
        this.nom = nom;
        this.population = population;
        this.continent = continent;
    }

    public String getContinent() {
        return continent;
    }
}
