package exemple_tableau;


public class App {

	public static void main(String[] args) {

		//declaration d'un tableau de chaine de caractère contenant 3 éléments
		String[] tabPrenom = new String[3];
		
		// stockage de valeur dans le tableau tabPrenom
		tabPrenom[0] = "David"; //1er élément
		tabPrenom[1] = "Paul"; //2ème élément
		tabPrenom[2] = "Jean"; //3ème élément
		
		//affichage de l'élément à l'indice 1
		System.out.print(tabPrenom[1]); // affiche Paul
		
		// affichage de tout les éléments du tableau
		for(int i = 0; i <=tabPrenom.length-1; i++)
		{
			System.out.println(tabPrenom[i] + " "+ i);
		}
	}

}