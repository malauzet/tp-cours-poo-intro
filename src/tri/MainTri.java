package tri;

import fichier.Ville;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTri {
    static void main() throws Exception {

        ArrayList<Ville> listeVilles = new ArrayList<>();

        Path chemin = Paths.get("recensement.csv");

        List<String> lignes = Files.readAllLines(chemin);

        for (int i = 1; i < lignes.size(); i++) {

            String[] tokens = lignes.get(i).split(";");

            String nom = tokens[6];
            String codeDep = tokens[2];
            String nomRegion = tokens[1];
            int population  = Integer.parseInt(tokens[9].trim().replace(" ", ""));

            listeVilles.add(new Ville(nom, codeDep, nomRegion, population));
        }

        /*Collections.sort(listeVilles);
        for (Ville v : listeVilles) {
            System.out.println(v);
        }*/

        listeVilles.sort(new ComparatorHabitant());
        System.out.println("=== Tri par habitants (croissant) ===");
        listeVilles.stream().limit(15).forEach(System.out::println); // Aperçu pour un test facile à lire

        listeVilles.sort(new ComparatorNom());
        System.out.println("\n=== Tri par nom (alphabétique) ===");
        listeVilles.stream().limit(15).forEach(System.out::println); // Aperçu pour un test facile à lire
    }
}
