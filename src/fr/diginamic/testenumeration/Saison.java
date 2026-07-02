package fr.diginamic.testenumeration;

public enum Saison {

    PRINTEMPS("Printemps", 1), 
    ETE("Été", 2),
    AUTOMNE("Automne", 3),
    HIVER("Hiver", 4);

    private final String libelle;
    private final int numOrdre;

    Saison(String libelle, int numOrdre) {
        this.libelle = libelle;
        this.numOrdre = numOrdre;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getNumOrdre() {
        return numOrdre;
    }

    public static Saison getSaisonFromNumOrdre(int numOrdre) {
        for (Saison saison : Saison.values()) {
            if (saison.getNumOrdre() == numOrdre) {
                return saison;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return libelle + " (n°" + numOrdre + ")";
    }
}
