package listes;

import java.util.ArrayList;
import java.util.Iterator;

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

        Iterator<String> it = liste.iterator();

        while (it.hasNext()) {
            String ville = it.next();
            if (ville.toLowerCase().startsWith("n")) {
                it.remove();
            }
        }
        System.out.println("Liste sans les villes commençant par 'N' : " + liste);
    }
}
