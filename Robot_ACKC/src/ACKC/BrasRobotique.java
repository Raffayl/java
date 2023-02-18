package ACKC;

public class BrasRobotique {
	private double hauteur;

	private boolean pinceOuverte = false;

	public BrasRobotique() {
		this.hauteur = 0;

	}

	public BrasRobotique(double hauteur) {
		this.hauteur = hauteur;

	}

	public void saisir(BrasRobotique brasRobotique) {
		brasRobotique.fermerPince();
	}

	public void use(BrasRobotique brasRobotique) {
		System.out.println("Le bras robotique utilise un outil");
	}

	public void lacher(BrasRobotique brasRobotique) {
		brasRobotique.ouvrirPince();
	}

	public void remonter() {
		this.hauteur += 5;
		System.out.println("Le bras robotique remonte");
	}

	public void descendre() {
		this.hauteur -= 5;
		System.out.println("Le bras robotique descend");
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

	public void fermerPince() {
		if (pinceOuverte) {
			System.out.println("Fermeture de la pince");
			pinceOuverte = false;
		} else {
			System.out.println("La pince est deja fermee !");
		}
	}

	public void ouvrirPince() {
		if (!pinceOuverte) {
			System.out.println("Ouverture de la pince");
			pinceOuverte = true;
		} else {
			System.out.println("La pince est daja ouverte !");
		}
	}
}
