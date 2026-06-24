package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {

        Compte[] comptes = new Compte[2];

        comptes[0] = new Compte(1, 999.99);
        comptes[1] = new CompteTaux(2, 1002.57, 2.1);

        for (Compte compte : comptes) {
            System.out.println(compte);
            System.out.println();
        }
    }
}
