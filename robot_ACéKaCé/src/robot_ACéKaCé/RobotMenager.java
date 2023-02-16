package robot_ACéKaCé;

public class RobotMenager {

	private String nom;
	public BrasRobotique brasRobotique;
	public Capteur capteur;
	public Plateau plateau;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	public Outil outil;

	public RobotMenager(String nom, BrasRobotique brasRobotique, Capteur capteur, Plateau plateau, Outil outil) {
		this.nom = nom;
		this.brasRobotique = brasRobotique;
		this.capteur = capteur;
		this.plateau = plateau;
		this.outil = outil;
=======
=======
>>>>>>> parent of d714848 (config ACKC)
=======
>>>>>>> parent of d714848 (config ACKC)
	//public enum Plateau {}
	public Outil outil;
 //public enum Outil {couteau,fouet,feuille;}
	public RobotMenager(String nom, BrasRobotique brasRobotique, Capteur capteur, Plateau plateau, Outil outil, Sensor[] capteurs) {
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
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> parent of d714848 (config ACKC)
=======
>>>>>>> parent of d714848 (config ACKC)
=======
>>>>>>> parent of d714848 (config ACKC)
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> parent of d714848 (config ACKC)
=======
>>>>>>> parent of d714848 (config ACKC)
=======
>>>>>>> parent of d714848 (config ACKC)
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		// Code pour descendre le bras du robot 
	}
}

class Capteur {
	public boolean detecterObstacle() {
		// Code pour detecter si il ya un obstacle
		return false; 
	}
}
=======
=======
>>>>>>> parent of d714848 (config ACKC)
=======
>>>>>>> parent of d714848 (config ACKC)
		// Code pour descendre le bras du robot
	}
}






<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> parent of d714848 (config ACKC)
=======
>>>>>>> parent of d714848 (config ACKC)
=======
>>>>>>> parent of d714848 (config ACKC)

class Plateau {
	// Code pour la class plateau
}

class Outil {
	public void nettoyer(Plateau plateau) {
		// Code pour nettoyer le plateau avec l'outil
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	
	}	
	
	
	
	// a faire 
	//	@Override
	//	public String toString() {

		//	return "Coordonnees X (en m) : " + this.coordonneeXEnM + "\nCoordonnees Y (en m) : " + this.coordonneeYEnM
		//			+ "\nAngle (en degres) : " + this.angleEnDegres + "\nBras gauche leve : " + this.brasGaucheLeve
		//			+ "\nBras droit leve : " + this.brasDroitLeve + "\nPince femeee : " + this.pinceFermee
		//			+ "\nLanterne allumee : " + this.lanterneAllumee + "\n---------------------";

	
	
	
	
	
	
	}
	
	
}
=======
=======
>>>>>>> parent of d714848 (config ACKC)
=======
>>>>>>> parent of d714848 (config ACKC)

	}

	
	 @Override
	 public String toString() {
		 return "nom : "+this.nom + "BrasRobotique :" + this.BrasRobotique + " Capteur : " + this.capteur + "Plateau : "+this.Plateau + "Outil : "+ Outil;
	 }	
	
	

	}

<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> parent of d714848 (config ACKC)
=======
>>>>>>> parent of d714848 (config ACKC)
=======
>>>>>>> parent of d714848 (config ACKC)
