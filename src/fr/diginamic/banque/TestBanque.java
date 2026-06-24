package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {

        Compte compte1 = new Compte(1, 999.99);
        Compte compte2 = new Compte(2, 1002.57);

        System.out.println(compte1);
        System.out.println();
        System.out.println(compte2);
    }
}
