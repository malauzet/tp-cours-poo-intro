package country;

public class TestEqualsPays {
    static void main() {

        Pays pays1 = new Pays("France", 68_000_000);
        Pays pays2 = new Pays("France", 68_000_000);

        System.out.println("===== Test equals valeurs identiques =====");
        if (pays1.equals(pays2)) {
            System.out.println("pays1 et pays2 sont identiques");
        }
        else  {
            System.out.println("pays1 et pays2 sont différents");
        }
        System.out.println();

        System.out.println("===== Test == valeurs identiques =====");
        if (pays1 == pays2) {
            System.out.println("pays1 et pays2 sont identiques");
        }
        else  {
            System.out.println("pays1 et pays2 sont différents");
        }
        System.out.println();

        Pays pays3 = new Pays("Suisse", 9_000_000);
        Pays pays4 = new Pays("Suisse", 8_000_000);

        System.out.println("===== Test equals valeurs différentes =====");
        if (pays3.equals(pays4)) {
            System.out.println("pays3 et pays4 sont identiques");
        }
        else  {
            System.out.println("pays3 et pays4 sont différents");
        }
        System.out.println();

        System.out.println("===== Test == valeurs différentes =====");
        if (pays3 == pays4) {
            System.out.println("pays3 et pays4 sont identiques");
        }
        else  {
            System.out.println("pays3 et pays4 sont différents");
        }
    }
}
