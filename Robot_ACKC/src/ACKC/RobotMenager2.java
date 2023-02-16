package ACKC;

import ACKC.RobotMenager2.Outil;

public class RobotMenager2 {

	private String nom;
	public BrasRobotique brasRobotique;
	public Capteur capteur;
	public Plateau plateau;
	public Outil outil;

	public RobotMenager2(String nom, BrasRobotique brasRobotique, Capteur capteur, Plateau plateau, Outil outil, Capteur[] capteurs) {
		this.nom = nom;
		this.brasRobotique = brasRobotique;
		this.plateau = plateau;
		this.outil = outil;
		this.capteur = capteur;
		
		this.capteur = new Capteur(this.plateau, this.brasRobotique, this.outil, capteurs);
	}

	public void RobotMenager() {
		this.nom = "rafbot";
		this.brasRobotique = new BrasRobotique();
		this.plateau = new Plateau();
		this.outil = Outil.COUPER; // Par défaut, on utilise le couteau
	}

	public void effectuerTache() {
		switch (outil) {
			case COUPER:
				brasRobotique.saisir(outil);
				brasRobotique.lacher(outil);
				// Code pour couper avec le couteau
				break;
			case FOUET:
				brasRobotique.saisir(outil);
				brasRobotique.lacher(outil);
				// Code pour mélanger avec le fouet
				break;
			case PETRIR:
				brasRobotique.saisir(outil);
				brasRobotique.lacher(outil);
				// Code pour pétrir avec la feuille
				break;
			default:
				System.out.println("Outil inconnu !");
		}

		if (capteur.detecterObstacle()) {
			brasRobotique.remonter();
			brasRobotique.descendre();
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public BrasRobotique getBrasRobotique() {
		return brasRobotique;
	}

	public void setBrasRobotique(BrasRobotique brasRobotique) {
		this.brasRobotique = brasRobotique;
	}

	public Capteur getCapteur() {
		return capteur;
	}

	public void setCapteur(Capteur capteur) {
		this.capteur = capteur;
	}

	public Plateau getPlateau() {
		return plateau;
	}

	public void setPlateau(Plateau plateau) {
		this.plateau = plateau;
	}

	public Outil getOutil() {
		return outil;
	}

	public void setOutil(Outil outil) {
		this.outil = outil;
	}

	public enum Outil {
		COUPER,
		FOUET,
		PETRIR
	}



	public void saisir(Outil outil) {
		// Code pour saisir l'outil avec le bras du robot
	}

	

	public void lacher(Outil outil) {
		// Code pour relâcher l'outil avec le bras du robot
	}

	public void remonter() {
		// Code pour remonter le bras du robot
	}

	public void descendre() {
		// Code pour descendre le bras du robot
	}
}


