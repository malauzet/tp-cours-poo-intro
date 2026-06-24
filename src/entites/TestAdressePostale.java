package entites;

public class TestAdressePostale {
    static void main(String[] args) {

        AdressePostale adresseP1 = new AdressePostale();
        adresseP1.numeroRue = 123;
        adresseP1.libelleRue = "Rue des roses";
        adresseP1.codePostal = 37000;
        adresseP1.ville = "Tours";

        AdressePostale adresseP2 = new AdressePostale();
        adresseP2.numeroRue = 20;
        adresseP2.libelleRue = "Route de Nîmes";
        adresseP2.codePostal = 34170;
        adresseP2.ville = "Castelnau-le-lez";

    }
}
