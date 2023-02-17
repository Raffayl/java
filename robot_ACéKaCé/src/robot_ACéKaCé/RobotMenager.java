package robot_ACéKaCé;

public class RobotMenager {

	private String nom;
	public BrasRobotique brasRobotique;
	public Capteur capteur;
	public Plateau plateau;

	public Outil outil;

	// remove duplicate declaration of Outil outil
	// public enum Plateau {}
	// public Outil outil;

	// add missing RobotMenager constructor with Sensor[] capteurs parameter
	public RobotMenager(String nom, BrasRobotique brasRobotique, Capteur capteur, Plateau plateau, Outil outil,
			Sensor[] capteurs) {
		this.nom = nom;
		this.brasRobotique = brasRobotique;
		this.plateau = plateau;
		this.outil = outil;

		// this.capteur = new Capteur(plateau, brasRobotique, outil, capteurs);
		this.capteur = new Capteur(this.plateau, this.brasRobotique, this.outil, capteurs);
	}

	public RobotMenager() {
		this.nom = "rafbot";
		// initialize empty instances of BrasRobotique, Plateau, and Outil
		this.brasRobotique = new BrasRobotique();
		this.plateau = new Plateau();
		this.outil = new Outil();
	}

	public void effectuerTache() {
		brasRobotique.saisir(outil);
		brasRobotique.lacher(outil);
		outil.nettoyer(plateau);
		brasRobotique.lacher(outil);

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
	
	// override toString() method to display object properties
	@Override
	public String toString() {
		return "nom: " + this.nom + " BrasRobotique: " + this.brasRobotique + " Capteur: " + this.capteur
				+ " Plateau: " + this.plateau + " Outil: " + this.outil;
	}
}

class BrasRobotique {
	// add default constructor
	public BrasRobotique() {}
	
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
		// Code