package entites;

public class AdressePostale {

    int numeroRue;
    String libelleRue;
    int codePostal;
    String ville;

    public String toString() {
        return numeroRue + ", " + libelleRue + ", " + codePostal + ", " + ville;
    }
}