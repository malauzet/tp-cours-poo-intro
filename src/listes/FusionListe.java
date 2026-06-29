package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
    static void main() {

        List<String> liste1 = new ArrayList<>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        List<String> liste2 = new ArrayList<>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        //TODO Développements à réaliser ci-dessous
        List<String> liste3 = new ArrayList<>();

        for(String s: liste1) {
            liste3.add(s);
        }
        for(String s: liste2) {
            liste3.add(s);
        }

        System.out.println(liste3);
    }
}