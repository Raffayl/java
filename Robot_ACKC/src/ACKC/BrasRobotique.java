package ACKC;

import ACKC.RobotMenager.Outil;

public class BrasRobotique {
	private double hauteur;

	private boolean pinceOuverte = false;

	public BrasRobotique() {
		this.hauteur = 0;

	}

	public BrasRobotique(double hauteur) {
		this.hauteur = hauteur;

	}

	public void saisir(Outil outil) {
		fermerPince(); // Fermer la pince pour saisir l'outil
		System.out.println("Saisie de l'outil " + outil.name());
	}

	public void use(Outil outil) {

		System.out.println("Le bras robotique utilise l'outil " + outil.name());
		outil.use();
	}

	public void lacher(Outil outil) {
		ouvrirPince(); // Ouvrir la pince pour relâcher l'outil
		System.out.println("Relachement de l'outil " + outil.name());
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
			ouvrirPince(); // appel de la méthode ouvrirPince() pour ouvrir la pince
			pinceOuverte = false;
		} else {
			System.out.println("La pince est dejà fermee !");
		}
	}

	public void ouvrirPince() {
		if (!pinceOuverte) {
			System.out.println("Ouverture de la pince");
			pinceOuverte = true;
		} else {
			System.out.println("La pince est dejà ouverte !");
		}
	}
}