package fr.diginamic.banque.entites;

public abstract class Operation {

    public String dateOperation;
    double montantOperation;

    public Operation(String dateOperation, double montantOperation) {
        this.dateOperation = dateOperation;
        this.montantOperation = montantOperation;
    }

    public String getDateOperation() {
        return dateOperation;
    }

    public double getMontantOperation() {
        return montantOperation;
    }

    public abstract String getType();
}
