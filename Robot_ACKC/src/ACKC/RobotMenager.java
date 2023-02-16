package ACKC;

//import robot_ACéKaCé.BrasRobotique;
//import robot_ACéKaCé.Capteur;
//import robot_ACéKaCé.Outil;
//import robot_ACéKaCé.Plateau;
//import robot_ACéKaCé.Sensor;

public class RobotMenager {



		private String nom;
		public BrasRobotique brasRobotique;
		public Capteur capteur;
		public Plateau plateau;
		//public enum Plateau {}
		public Outil outil;
	// public enum Outil {couteau,fouet,feuille;}
		public RobotMenager(String nom, BrasRobotique brasRobotique, Capteur capteur, Plateau plateau, Outil outil, Capteur[] capteurs) {
		    this.nom = nom;
		    this.brasRobotique = brasRobotique;
		    this.plateau = plateau;
		    this.outil = outil;
		    
		    
		    // this.capteur = new Capteur(plateau, brasRobotique, outil, capteurs);	
		    this.capteur = new Capteur(this.plateau, this.brasRobotique, this.outil, capteurs);
		}
		
		public RobotMenager () {
			 this.nom = "rafbot";
			    this.brasRobotique = brasRobotique;
			    this.plateau = plateau;
		//	    this.outil = "couteau,fouet,feuille";
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
	}

	class BrasRobotique {
		public void saisir(Outil outil) {
			// Code pour saisir loutil avec le bras du robot
		}

		public void lacher(Outil outil) {
			// Code pourrelacher l'outil avec le bras du robot
		}

		public void remonter() {
			// Code pour remonter le bras du robot
		}

		public void descendre() {
			// Code pour descendre le bras du robot
		}
	}







	class Plateau {
		// Code pour la class plateau
	}

	class Outil {
		public void nettoyer(Plateau plateau) {
			// Code pour nettoyer le plateau avec l'outil

		}

		

		

		}

