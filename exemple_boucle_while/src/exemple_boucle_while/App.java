package exemple_boucle_while;

/*
 * 
 * VARIABLE
 * compteur est un entier
 * 
 * DEBUT DE PROGRAMME
	compteur <-- 1
	tant compteur <= 50
	ecrire compteur
	compteur +1
	
	fin de boucle tant que 
 
 * FIN DE PROGRAMME 
 */

public class App {

	public static void main(String[] args) {
		int compteur = 1;
		while(compteur<50)
		{
			System.out.println(compteur + " ");
			compteur++;
		}

	}

}
