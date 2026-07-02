package listes;

import java.util.ArrayList;

public class TestContinentAvecEnum {
    static void main() {

        ArrayList<Ville> liste = new ArrayList<>();
        liste.add(new Ville("New York", 8_478_000, Continent.AMERIQUE));
        liste.add(new Ville("Paris", 2_048_800, Continent.EUROPE));
        liste.add(new Ville("Pékin", 21_900_000, Continent.ASIE));
        liste.add(new Ville("Moscou", 13_100_000, Continent.EUROPE));
        liste.add(new Ville("Berlin", 3_897_000,  Continent.EUROPE));
        liste.add(new Ville("Sydney", 5_450_000,  Continent.OCEANIE));
        liste.add(new Ville("Sao Paulo", 11_900_000, Continent.AMERIQUE));
        liste.add(new Ville("Dakar", 1_278_000, Continent.AFRIQUE));

        for  (Ville v : liste) {
            IO.println(v.toString());
        }
    }
}
