package country;

import java.util.Objects;

public class Pays {

    String nom;
    int population;

    public Pays(String nom, int population) {
        this.nom = nom;
        this.population = population;
    }

    public String getNom() {
        return nom;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pays pays)) return false;
        return getPopulation() == pays.getPopulation() && Objects.equals(getNom(), pays.getNom());
    }
}
