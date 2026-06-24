package entites2;

import entites.AdressePostale;

public class Personne {

    public String nom;
    public String prenom;
    public AdressePostale addressPostale = new AdressePostale();

    public String toString(){
        return nom + ", " + prenom + ", " + addressPostale.toString();
    }
}
