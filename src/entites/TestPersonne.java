package entites;

import entites2.Personne;

public class TestPersonne {
    static void main() {

        AdressePostale ad1 = new AdressePostale(
                123, "Rue des roses", 37000, "Tours");
        AdressePostale ad2 = new AdressePostale(
                20, "Route de Nîmes", 34170, "Castelnau-le-lez");

        Personne personne1 = new Personne("Alauzet", "Marius");
        personne1.setAddressPostale(ad1);

        Personne personne2 = new Personne("Alauzet", "Tristan");
        personne2.setAddressPostale(ad2);

        //System.out.println(personne1);
        //System.out.println(personne2);

        personne1.afficherIdentite();
        personne2.afficherIdentite();
    }
}
