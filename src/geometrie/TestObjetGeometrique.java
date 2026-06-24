package geometrie;

public class TestObjetGeometrique {
    public static void main(String[] args) {

        ObjetGeometrique[] objets = new ObjetGeometrique[2];

        objets[0] = new Cercle(5);
        objets[1] = new Rectangle(4, 7);

        for (ObjetGeometrique objet : objets) {
            System.out.println("----------");
            System.out.println("Forme     : " + objet.getClass().getSimpleName()); // Aide IA
            System.out.printf ("Périmètre : %.2f%n", objet.perimetre());
            System.out.printf ("Surface   : %.2f%n", objet.surface());
        }
    }
}