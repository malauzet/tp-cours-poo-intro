package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CreerFichier {
    static void main() throws IOException {

        Path original = Paths.get("recensement.csv");
        Path copie100 = Paths.get("recensement100.csv");

        List<String> lignes = Files.readAllLines(original);
        List<String> cent   = lignes.subList(0, Math.min(100, lignes.size()));
        Files.write(copie100, cent);

        for (String ligne : cent) {
            System.out.println(ligne);
        }
    }
}
