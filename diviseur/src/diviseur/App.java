package diviseur;

	/*Variables
	 * i:= entier // itterateur
 * 		n:= entier // saii de lutilisateur
 * 
 * DEBUT DE PROGRAMME 
 * ecrire " veuiller saisir un nombre "
 * lire n
 * 
 * pour i de 2 a n
 */
import java.util.Scanner;

// Lire un nombre entier et afficher tous ses diviseurs autres que 1 et lui-même


public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Entrez un nombre entier: ");
	    int n = scanner.nextInt();

	    System.out.print("Les diviseurs de " + n + " sont : ");
	    for (int i = 2 ; i <= n; i++) {
	      if (n % i == 0) {
	        System.out.println(i + " ");

	}
	    }
}
}