package entites2;

import entites.AdressePostale;

public class Personne {

    public String nom;
    public String prenom;
    public AdressePostale addressPostale;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, AdressePostale addressPostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.addressPostale = addressPostale;
    }

    public String toString(){
        return nom + ", " + prenom + ", " + (addressPostale != null ? addressPostale.toString() : "pas d'adresse");
    }
}
