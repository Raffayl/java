package exemple_nombre_aleatoire;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		// on declare les variables min et max pour définir les limites
		int min = 0;
		int max = 100;
		// on declare un objet Random appellé rand
		Random rand = new Random();
		// on declare une variable pour y stocker le nombre aléatoire
        int nb;
        // on assigne à la variable nb un nombre aléatoire
   
        nb = rand.nextInt(max - min +1) + min;
         // on affiche le nombre aléatoire
        System.out.println(nb);
	}

}