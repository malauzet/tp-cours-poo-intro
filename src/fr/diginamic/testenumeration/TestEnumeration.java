package fr.diginamic.testenumeration;

public class TestEnumeration {
    static void main() {

        for (Saison saison : Saison.values()) {
            System.out.println(saison);
        }

        IO.println();
        IO.println("Libellé de la saison ETE : " + Saison.ETE.getLibelle());

        int num = 3;

        IO.println();
        IO.println("Saison liée au numéro " + num + " : " + Saison.getSaisonFromNumOrdre(num));
    }
}
