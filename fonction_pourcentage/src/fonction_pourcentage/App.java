package fonction_pourcentage;

public class App {
    public static void main(String[] args) {
        int carteBleue = 5;
        int cheques = 10;
        int virements = 5;
        int total = carteBleue + cheques + virements;
        double pourcentageCarteBleue = pourcentage(carteBleue, total);
        double pourcentageCheques = pourcentage(cheques, total);
        double pourcentageVirements = pourcentage(virements, total);
        System.out.println("Pourcentage d'utilisation de la Carte Bleue : " + pourcentageCarteBleue + "%");
        System.out.println("Pourcentage d'utilisation des chèques : " + pourcentageCheques + "%");
        System.out.println("Pourcentage d'utilisation des virements automatiques : " + pourcentageVirements + "%");
    }

    public static double pourcentage(int part, int total) {
        return (part / (double) total) * 100;
    }
}