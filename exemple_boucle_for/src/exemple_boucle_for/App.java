package exemple_boucle_for;

/*
 * 
 * EXEMPLES BOUCLE FOR qui compte de 1 a 100
 * VARIABLES
 * 
 * i est un entier
 * 
 * DEBUT DU PROGRAMME
 * 
 * 
 * Debut boucle pour
 * pour i allant de 1 a 100
 * 	ecrire i 
 * fin de boucle pour
 * 
 * FIN DU PROGRAMME
 */
public class App {

	public static void main(String[] args) {
		
 // declarer la variable
		int i;
		//boucle for de 1 a 50
		for ( i = 1 ; i <= 50 ;i++)
		{
			System.out.println(i);
		}
		// boucle for de 50 a 1
		for(int j=50; j>=1; j--)
		{
			System.out.println(j);
		}
		// boucle for de 2 a 50 avec pas de 2 
		for(int k = 2; k<=50; k+=2)
		{
			System.out.println(k);
		}
	}
	}


