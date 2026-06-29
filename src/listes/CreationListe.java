package listes;

import java.util.ArrayList;

public class CreationListe {
    static void main() {

        ArrayList<Integer> liste = new ArrayList<>();

        for(int i = 1; i <= 100;i++) {
            liste.add(i);
        }

        System.out.println("La liste a une taille de : " + liste.size());
    }
}
