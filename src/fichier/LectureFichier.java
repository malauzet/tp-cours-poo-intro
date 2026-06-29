package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws IOException {

        ArrayList<Ville> listeVilles = new ArrayList<>();

        Path chemin = Paths.get("recensement.csv");

        List<String> lignes = Files.readAllLines(chemin);

        /*for (String ligne : lignes) {
            System.out.println(ligne);
        }*/

        for (int i = 1; i < lignes.size(); i++) {

            String[] tokens = lignes.get(i).split(";");

            String nom = tokens[6];
            String codeDep = tokens[2];
            String nomRegion = tokens[1];
            int population  = Integer.parseInt(tokens[9].trim().replace(" ", ""));

            listeVilles.add(new Ville(nom, codeDep, nomRegion, population));
        }

        // Afficher les villes
        /*for (Ville v : listeVilles) {
            System.out.println(v);
        }
        System.out.println("Nombre de villes chargées : " + listeVilles.size());*/

        List<String> lignesSortie = new ArrayList<>();
        lignesSortie.add("Nom;Code département;Nom de la région;Population Totale");

        for (Ville v : listeVilles) {
            if (v.getPopulation() > 25000) {
                String ligne = v.getNom() + ";"
                        + v.getCodeDep() + ";"
                        + v.getNomRegion() + ";"
                        + v.getPopulation();
                lignesSortie.add(ligne);
            }
        }

        Path sortie = Paths.get("villes_25000.csv");
        Files.write(sortie, lignesSortie);

        System.out.println("Fichier généré : " + (lignesSortie.size() - 1) + " villes de plus de 25 000 habitants.");
    }
}
