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

	public void saisir() {
		fermerPince(); // Fermer la pince pour saisir l'outil
	}

	public void use() {
		System.out.println("Le bras robotique utilise un outil");
	}

	public void lacher() {
		ouvrirPince(); // Ouvrir la pince pour relâcher l'outil
	}

	public void remonter() {
		this.hauteur += 5;
		System.out.println("Le bras robotique remonte de 5 unit's.");
	}

	public void descendre() {
		this.hauteur -= 5;
		System.out.println("Le bras robotique descend de 5 unit's.");
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
			System.out.println("La pince est déjà fermée !");
		}
	}

	public void ouvrirPince() {
		if (!pinceOuverte) {
			System.out.println("Ouverture de la pince");
			pinceOuverte = true;
		} else {
			System.out.println("La pince est déjà ouverte !");
		}
	}
}
