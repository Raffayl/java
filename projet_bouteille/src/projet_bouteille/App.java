package projet_bouteille;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Entrez la capacité en litre de la bouteille : ");
	        double capaciteEnL = scanner.nextDouble();
	        System.out.print("Entrez la contenance en litre de la bouteille : ");
	        double contenanceEnL = scanner.nextDouble();
	        System.out.print("La bouteille est-elle ouverte (true/false) : ");
	        boolean estOuverte = scanner.nextBoolean();
	        System.out.print("Entrez le nom de la bouteille : ");
	        String nom = scanner.next();

	        Bouteille bouteille = new Bouteille(capaciteEnL, contenanceEnL, estOuverte, nom);
	        scanner.close();
	   
	    }
	

	}


