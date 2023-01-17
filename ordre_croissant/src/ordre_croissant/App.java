package ordre_croissant;
// On importe la classe Scanner de l'API Java pour pouvoir lire les entrées de l'utilisateur.
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Lire 2 nombres entier a et b puis les afficher dans l'ordre croissant
		
		//On crée un Scanner qui lit les entrées de l'utilisateur à partir de l'entrée standard (le clavier).
		Scanner Sc = new Scanner(System.in);
		
		//Declaration des variables (On lit les nombres entiers a et b en utilisant les méthodes nextInt du Scanner.)
		 System.out.print("Entrez a: ");
		    int a = Sc.nextInt();

		    System.out.print("Entrez b: ");
		    int b = Sc.nextInt();

		    //On compare les nombres a et b pour déterminer s'ils sont dans l'ordre croissant ou non. Si ce n'est pas le cas, on échange leurs valeurs en utilisant une variable temporaire.
		    
		    if (a > b) {
		      int temp = a;
		      a = b;
		      b = temp;
		    }

		    System.out.println("a = " + a);
		    System.out.println("b = " + b);
		
		//On affiche les nombres a et b dans l'ordre croissant.
		    
		    //fin
		
		Sc.close();

	}

}
