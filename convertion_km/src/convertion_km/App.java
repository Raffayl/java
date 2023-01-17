package convertion_km;

	/*
 VARIABLES
 	km est un reel
 	miles est un reel
 	fermeture_prog est un boolean
 	quit est une chaine de caractère
 	saisie_utilisateur est une chaine de caractère
 
 DEBUT DU PROGRAMME
 
 	Tant que fermeture_prog est faux 
 	Faire
 		Ecrire "Veuillez saisir une valeur en km comprise entre 0,01 et 1000000"
 		lire saisie utilisateur
 			Si saisie_utilisateur est egale à quit
 				Alors fermeture_prog est vraie
 			Sinon
 				km<-- conversion en reel de saisie utilisateur
 				Si km est inférieur à 0,01 ou supèrieur à 1000000
 					Alors 
 						Ecrire "Veuillez saisir une valeur en km comprise entre 0,01 et 1000000"
 						lire saisie utilisateur
 					Sinon
 						miles = km/1,609
 						Ecrire km + " kilomètres valent : "+miles+" miles"
 				Fin Si
 			Fin Si
 	Fin Tant que
 
 FIN DU PROGRAMME

	 */


import java.util.Scanner;

 public class App {
  public static void main(String[] args) {
	//declaration des variables
			double km; 
			double miles;
			String quit = "q";
			String saisie_utilisateur;
			boolean fermeture_prog = false;
			Scanner sc = new Scanner(System.in);
			
			 // boucle tant que fermeture_prog est faux
			while(!fermeture_prog)
		    {
		        System.out.println("Veuillez saisir une valeur en km comprise entre 0,01 et 1000000 :");
		        saisie_utilisateur = sc.nextLine();
		        // on teste si l'utilisateur a saisie q
		        if(saisie_utilisateur.equals(quit))
		        {
		        	// si oui on ferme le programme
		        	fermeture_prog = true;
		        }
		        else 
		        {
		        	// sinon on convertie la chaine de caractère saisie en double
		            km = Double.parseDouble(saisie_utilisateur);
		            // on teste si la valeur saisie est compris entre 0,01 et 1000000
		            if(km < 0.01 || km > 1000000)
		            {
		            	// si oui on redemande de saisir la valeur
		            System.out.println("Veuillez saisir une valeur en km comprise entre 0,01 et 1000000 :");
		            saisie_utilisateur = sc.nextLine();
		            }
		            else 
		            {
		            	// sinon on fait la conversion et on affiche le rèsultat
		            miles = km/1.609;
		            System.out.println(km + " kilomètres valent : "+miles+" miles");
  }
		        }
}
	
  }
}
 