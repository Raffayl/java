package projet_bouteille_2;



public class BouteilleApp {
	

	public static void main(String[] args) {
		
		Bouteille b = new Bouteille();

		String btoString = b.toString();

		System.out.println(b.toString());

		boolean ok = b.ouvrir();

		Bouteille b1 = new Bouteille(1.0, 0, true, "Bourbon");
		boolean ok2 = b1.ouvrir();
		Bouteille b2 = new Bouteille();

		System.out.println("Bouteille 1 nom: " + b1.DonneLeNom());
		System.out.println("Bouteille 1 est ouverte? " + b1.estOuverte);
		b1.ouvrir();
		System.out.println("Bouteille 1 nest pas pleine? " + b1.estOuverte);
		b1.remplirTout();
		System.out.println("Bouteille 1 contenant: " + b1.contenuEnLitre + "L");
		b1.vider(0.5);
		System.out.println("Bouteille 1 contenu: " + b1.contenuEnLitre + "L");
		b1.fermer();
		System.out.println("Bouteille 1 est ouverte? " + b1.estOuverte);

		System.out.println("Bouteille 2 nom: " + b2.DonneLeNom());
		System.out.println("Bouteille 2 est ouverte? " + b2.estOuverte);
		b2.ouvrir();
		b2.remplir(0.5);
		System.out.println("Bouteille 2 contenu: " + b2.contenuEnLitre + "L");
	//	b2.vidertout();
		System.out.println("Bouteille 2 contenu: " + b2.contenuEnLitre + "L");
	}
}