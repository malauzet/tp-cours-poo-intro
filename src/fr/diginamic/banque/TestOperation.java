package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

import java.util.Objects;

public class TestOperation {
    public static void main(String[] args) {

        Credit c1 = new Credit("01/06/2025", 2100.00);
        Credit c2 = new Credit("02/06/2025", 2200.00);
        Credit c3 = new Credit("03/06/2025", 2300.00);
        Credit c4 = new Credit("04/06/2025", 2400.00);
        Debit d1 = new Debit("01/06/2025", 1100.00);
        Debit d2 = new Debit("02/06/2025", 1200.00);
        Debit d3 = new Debit("03/06/2025", 1300.00);
        Debit d4 = new Debit("04/06/2025", 1400.00);

        Operation[] operations = {c1, c2, c3, c4, d1, d2, d3, d4};

        System.out.println("=== Liste des opérations ===");
        for (Operation op : operations) {
            System.out.println("Date : " + op.getDateOperation()
                    + " | Montant : " + op.getMontantOperation() + " €"
                    + " | Type : " + op.getType());
        }

        double montantGlobal = 0;

        for (Operation op : operations) {
            if (Objects.equals(op.getType(), "CREDIT")) {
                montantGlobal += op.getMontantOperation();
            } else if (Objects.equals(op.getType(), "DEBIT")) {
                montantGlobal -= op.getMontantOperation();
            }
        }

        System.out.println("\n=== Montant global ===");
        System.out.println("Solde : " + montantGlobal + " €");
    }
}
