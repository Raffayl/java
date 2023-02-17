package ACKC;

public class Cuve {
    private int capaciteMax;
    private int niveau;

    public Cuve(int capaciteMax) {
        this.capaciteMax = capaciteMax;
        this.niveau = 0;
    }

    public void remplir(int quantite) {
        if (niveau + quantite > capaciteMax) {
            System.out.println("Erreur : la cuve ne peut pas être remplie au-delà de sa capacité maximale.");
        } else {
            niveau += quantite;
            System.out.println("La cuve a été remplie de " + quantite + " unité(s).");
        }
    }

    public void vider(int quantite) {
        if (niveau - quantite < 0) {
            System.out.println("Erreur : la cuve ne peut pas être vidée en dessous de zéro.");
        } else {
            niveau -= quantite;
            System.out.println("La cuve a été vidée de " + quantite + " unité(s).");
        }
    }

    public int getNiveau() {
        return niveau;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
}