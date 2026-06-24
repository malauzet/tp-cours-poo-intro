package entites;

import entites2.Personne;

public class TestPersonne {
    static void main() {

        AdressePostale ad1 = new AdressePostale();
        ad1.numeroRue = 123;
        ad1.libelleRue = "Rue des roses";
        ad1.codePostal = 37000;
        ad1.ville = "Tours";

        AdressePostale ad2 = new AdressePostale();
        ad2.numeroRue = 20;
        ad2.libelleRue = "Route de Nîmes";
        ad2.codePostal = 34170;
        ad2.ville = "Castelnau-le-lez";

        Personne personne1 = new Personne();
        personne1.nom = "Alauzet";
        personne1.prenom = "Marius";
        personne1.addressPostale = ad1;

        Personne personne2 = new Personne();
        personne2.nom = "Alauzet";
        personne2.prenom = "Tristan";
        personne2.addressPostale = ad2;

        System.out.println(personne1);
        System.out.println(personne2);
    }
}
