package maps;

import fichier.Ville;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapVilles {
    static void main() throws IOException {

        Map<String, Ville> mapVilles = new HashMap<>();

        Path chemin = Paths.get("recensement.csv");
        List<String> lignes = Files.readAllLines(chemin);

        for (int i = 1; i < lignes.size(); i++) {

            String[] tokens = lignes.get(i).split(";");

            String nom = tokens[6];
            String codeDep = tokens[2];
            String nomRegion = tokens[1];
            int population = Integer.parseInt(tokens[9].trim().replace(" ", ""));

            mapVilles.put(nom, new Ville(nom, codeDep, nomRegion, population));
        }

        System.out.println("Nombre de villes chargées : " + mapVilles.size());

        String nomMoinsHabitants = null;
        int popMin = Integer.MAX_VALUE;

        for (Map.Entry<String, Ville> entry : mapVilles.entrySet()) {
            if (entry.getValue().getPopulation() < popMin) {
                popMin = entry.getValue().getPopulation();
                nomMoinsHabitants = entry.getKey();
            }
        }

        if (nomMoinsHabitants != null) {
            Ville villeSupprimee = mapVilles.remove(nomMoinsHabitants);
            System.out.println("\nVille supprimée : " + villeSupprimee);
        }

        System.out.println("\n=== Villes restantes (" + mapVilles.size() + ") ===");
        for (Map.Entry<String, Ville> entry : mapVilles.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        System.out.println("\nNombre de villes restantes : " + mapVilles.size());
    }
}
