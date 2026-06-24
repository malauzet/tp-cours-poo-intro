package utils;

public class TestMethodeStatic {
    public static void main(String[] args) {

        String chaine = "12";
        int chaine2 = Integer.parseInt(chaine);

        int a = 35;
        int b = 50;
        String nomMax = (a > b) ? "a" : "b";

        // Affichage de base
        System.out.println(Math.max(a, b));

        // Mise en forme
        System.out.println("Le variable avec la plus grande valeur est : " + nomMax + " (" + Math.max(a, b) + ")");
    }
}
