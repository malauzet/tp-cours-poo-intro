package entites2;

import entites.AdressePostale;

public class Personne {

    public String nom;
    public String prenom;
    public AdressePostale addressPostale;

    // Constructeur ------------------------------------------------------------------------------------
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, AdressePostale addressPostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.addressPostale = addressPostale;
    }

    // Setters -----------------------------------------------------------------------------------------
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAddressPostale(AdressePostale addressPostale) {
        this.addressPostale = addressPostale;
    }

    // Getters -----------------------------------------------------------------------------------------
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public AdressePostale getAddressPostale() {
        return addressPostale;
    }

    // Affichage ---------------------------------------------------------------------------------------
    public void afficherIdentite() {
        System.out.println(nom.toUpperCase() + " " + prenom);
    }

    public String toString(){
        return nom + ", " + prenom + ", " + (addressPostale != null ? addressPostale.toString() : "pas d'adresse");
    }
}
