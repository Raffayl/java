package projet_bouteille_2;

public class BouteilleApp {

	public static void main(String[] args) {

		Bouteille b1 = new Bouteille(2.0, 1.0, true, "Bourbon");
		Bouteille b2 = new Bouteille();

		System.out.println("Bouteille 1 nom: " + b1.DonneLeNom());
		System.out.println("Bouteille 1 est ouverte? " + b1.estOuverte);
		b1.ouvrir();
		System.out.println("Bouteille 1 est pas pleine? " + b1.estOuverte);
		b1.remplirTout();
		System.out.println("Bouteille 1 contenant: " + b1.contenuEnLitre + "L");
		b1.vider(0.5);
		System.out.println("Bouteille 1 contenu: " + b1.contenuEnLitre + "L");
		b1.fermer();
		System.out.println("Bouteille 1 est ouverte? " + b1.estOuverte);

		System.out.println("Bouteille 2 nom: Cognac " + b2.DonneLeNom());
		System.out.println("Bouteille 2 est ouverte? " + b2.estOuverte);
		b2.ouvrir();
		b2.remplir(1.0);
		System.out.println("Bouteille 2 contenu: " + b2.contenuEnLitre + "L");
		b2.vidertout();
		System.out.println("Bouteille 2 contenu: " + b2.contenuEnLitre + "L");
	}
}