package nombre_premier;

import java.util.Scanner;

/* Début
  Écrire "Entrez un nombre :"
  Lire N
  Si N <= 1 alors
    Écrire N, "n'est pas un nombre premier"
    Arrêter
  Fin Si
  Pour i allant de 2 à N-1
    Si N est divisible par i alors
      Écrire N, "n'est pas un nombre premier"
      Arrêter
    Fin Si
  Fin Pour
  Écrire N, "est un nombre premier"
Fin
 */

public class App {

	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);

	    // On demande à l'utilisateur de saisir un nombre N.
	   
	    System.out.print("Entrez un nombre : ");
	    int n = scanner.nextInt();

	    // Si N est inférieur ou égal à 1, on affiche un message indiquant que N n'est pas un nombre premier et on arrête le programme.
	  
	    if (n <= 1) {
	      System.out.println(n + " n'est pas un nombre premier");
	      return;
	    }
	    // Sinon, on utilise une boucle Pour pour parcourir les entiers de 2 à N-1.
	  
	    for (int i = 2; i < n; i++) {
	    	
	    	//Pour chaque entier i, on vérifie si N est divisible par i en utilisant 
	    	//l'opérateur modulo (%). Si c'est le cas, on affiche un message indiquant
	    	// que N n'est pas un nombre premier et on arrête le programme.
	    	
	    	if (n % i == 0) {
	    		
	    		/*Si la boucle se termine sans trouver de diviseur, cela signifie que N n'est divisible 
	    		 * par aucun entier autre que 1 et lui-même, donc N est un nombre premier.
	    		 *  On affiche un message indiquant que N est un nombre premier.
	    		 */
	        System.out.println(n + " n'est pas un nombre premier");
	        return;
	      }
	    }

	    System.out.println(n + " est un nombre premier");
		
	    scanner.close();
	}
}
