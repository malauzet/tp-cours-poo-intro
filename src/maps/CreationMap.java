package maps;

import java.util.HashMap;
import java.util.Map;

public class CreationMap {
    static void main() {

        Map<String, Integer> mapSalaires = new HashMap<>();
        mapSalaires.put("Paul", 1750);
        mapSalaires.put("Hicham", 1825);
        mapSalaires.put("Yu", 2250);
        mapSalaires.put("Ingrid", 2015);
        mapSalaires.put("Chantal", 2418);

        System.out.println("Taille de la map : " + mapSalaires.size());

        System.out.println("————————————————————————");

        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");

        mapVilles.put(59, "Lilles");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        for (Integer i : mapVilles.keySet()) {
            System.out.println(i + " : " + mapVilles.get(i));
        }

        System.out.println("Taille de la map : " + mapVilles.size());
    }
}
