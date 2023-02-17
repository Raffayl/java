package ACKC;

import ACKC.RobotMenager2.Outil;

public class BrasRobotique {
	private double hauteur;
	private double orientation;

	public BrasRobotique() {
		this.hauteur = 0;
		this.orientation = 0;
	}

	public BrasRobotique(double hauteur, double orientation) {
		this.hauteur = hauteur;
		this.orientation = orientation;
	}

	public void saisir(Outil outil) {
	    fermerPince();  // Fermer la pince pour saisir l'outil
	    System.out.println("Saisie de l'outil " + outil.name());
	}

	public void use(Outil outil) {
		// code pour utiliser l'outil avec le bras du robot
		System.out.println("Le bras robotique utilise l'outil " + outil.name().toLowerCase() + ".");
		outil.use();
	}

	public void lacher(Outil outil) {
	    ouvrirPince();  // Ouvrir la pince pour relâcher l'outil
	    System.out.println("Relachement de l'outil " + outil.name());
	}

	public void remonter() {
		// Code pour remonter le bras du robot
		this.hauteur += 10;
		System.out.println("Le bras robotique a été remonté de 10 unités.");
	}

	public void descendre() {
		// Code pour descendre le bras du robot
		this.hauteur -= 10;
		System.out.println("Le bras robotique a été descendu de 10 unités.");
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

	public double getOrientation() {
		return orientation;
	}

	public void setOrientation(double orientation) {
		this.orientation = orientation;
	}

	public void fermerPince() {
	    System.out.println("Fermeture de la pince");
	    // Code pour fermer la pince du bras robotique
	}

	public void ouvrirPince() {
	    System.out.println("Ouverture de la pince");
	    // Code pour ouvrir la pince du bras robotique
	}
}
