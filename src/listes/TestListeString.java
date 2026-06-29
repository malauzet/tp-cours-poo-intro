package listes;

import java.util.ArrayList;

public class TestListeString {
    static void main() {

        ArrayList<String> liste = new ArrayList<>();
        liste.add("Nice");
        liste.add("Carcassonne");
        liste.add("Narbonne");
        liste.add("Lyon");
        liste.add("Foix");
        liste.add("Pau");
        liste.add("Marseille");
        liste.add("Tarbes");

        int max = 0;
        String maxS = "";

        for (String ville : liste) {
            if (ville.length() > max) {
                max = ville.length();
                maxS = ville;
            }
        }
        System.out.println("Le nom de ville le plus long de la liste est : " + maxS);

        for (int i = 0; i < liste.size(); i++) {
            liste.set(i, liste.get(i).toUpperCase());
        }
        System.out.println("La liste en majuscules : " + liste);

        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).startsWith("N")) {
                liste.remove(liste.get(i));
            }
        }
        System.out.println("Liste sans les villes commencent par 'N' : " + liste);
    }
}
