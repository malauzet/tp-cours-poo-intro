package listes;

import java.util.ArrayList;

public class TestVilles {
    static void main() {

        ArrayList<Ville> liste = new ArrayList<>();
        liste.add(new Ville("Nice", 343_000));
        liste.add(new Ville("Carcassonne", 47_800));
        liste.add(new Ville("Narbonne", 53_400));
        liste.add(new Ville("Lyon", 484_000));
        liste.add(new Ville("Foix", 9_700));
        liste.add(new Ville("Pau", 77_200));
        liste.add(new Ville("Marseille", 850_700));
        liste.add(new Ville("Tarbes", 40_600));


        Ville villeMax = liste.getFirst();
        for (Ville v : liste) {
            if (v.getNbHabitants() > villeMax.getNbHabitants()) {
                villeMax = v;
            }
        }
        System.out.println("La ville la plus peuplée est : " + villeMax.getNom());

        Ville villeMin = liste.getFirst();
        for (Ville v : liste) {
            if (v.getNbHabitants() < villeMin.getNbHabitants()) {
                villeMin = v;
            }
        }
        System.out.println("La ville la moins peuplée est : " + villeMin.getNom());
        liste.remove(villeMin);
        System.out.println("On enlève la ville la moins peuplée : " + liste);

        for (Ville v : liste) {
            if (v.getNbHabitants() > 100_000) {
                v.setNom(v.getNom().toUpperCase());
            }
        }
        System.out.println(liste);
    }
}
