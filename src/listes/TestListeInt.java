package listes;

import java.util.ArrayList;

public class TestListeInt {
    static void main() {

        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(-1);
        liste.add(5);
        liste.add(7);
        liste.add(3);
        liste.add(-2);
        liste.add(4);
        liste.add(8);
        liste.add(5);

        System.out.println("Liste : " + liste);

        System.out.println("Taille de la liste : " + liste.size());

        System.out.println("Plus grand élément de la liste : " + liste.stream().max(Integer::compare).get());

        System.out.println("Plus petit élément de la liste : " + liste.stream().min(Integer::compare).get());
        int min = liste.stream().min(Integer::compare).get();
        liste.remove(Integer.valueOf(min));
        System.out.println("Liste après suppression du plus petit élément : " + liste);


        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) < 0) {
                liste.set(i, -liste.get(i));
            }
        }
        System.out.println("Liste après changement des valeurs négatives en positives : " + liste);
    }
}
