package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ComptagePaysParContinent {
    static void main() {

        ArrayList<Pays> listePays = new ArrayList<>();
        listePays.add(new Pays("France", 65_000_000, "Europe"));
        listePays.add(new Pays("Allemagne", 80_000_000, "Europe"));
        listePays.add(new Pays("Belgique", 10_000_000, "Europe"));
        listePays.add(new Pays("Russie", 150_000_000, "Asie"));
        listePays.add(new Pays("Chine", 1_400_000_000, "Asie"));
        listePays.add(new Pays("Indonésie", 220_000_000, "Océanie"));
        listePays.add(new Pays("Australie", 20_000_000, "Océanie"));

        Map<String, Integer> map = new HashMap<>();

        for (Pays pays : listePays) {

            String continent = pays.getContinent();

            if (map.containsKey(continent)) {
                map.put(continent, map.get(continent) + 1);
            } else {
                map.put(continent, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " pays");
        }

    }
}
