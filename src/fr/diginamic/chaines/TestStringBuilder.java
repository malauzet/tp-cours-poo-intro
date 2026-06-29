package fr.diginamic.chaines;

public class TestStringBuilder {
    static void main() {

        long debut = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 100_000; i++) {
            sb.append(i);
        }

        System.out.println("Longueur du contenu : " + sb.length() + " caractères");
        System.out.println("Aperçu : " + sb.substring(0, 50) + "...");

        long fin = System.currentTimeMillis();
        System.out.println("Temps (ms) : " + (fin - debut));

        System.out.println("————————————————————————————————————");

        long debut2 = System.currentTimeMillis();

        String str = "";

        for (int i = 1; i <= 100_000; i++) {
            str += i;
        }

        System.out.println("Longueur du contenu : " + str.length() + " caractères");
        System.out.println("Aperçu : " + str.substring(0, 50) + "...");

        long fin2 = System.currentTimeMillis();
        System.out.println("Temps (ms) : " + (fin2 - debut2));
    }
}
