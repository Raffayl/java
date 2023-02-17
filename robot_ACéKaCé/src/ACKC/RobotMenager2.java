package ACKC;
/*
import ACKC.Cuve;
import ACKC.BrasRobotique;
import ACKC.RobotMenager2.Outil;
import ACKC.Capteur;
*/
public class RobotMenager2 {

	
	private String nom;
	private static BrasRobotique brasRobotique;
	private Capteur capteur;
	private Cuve cuve;
	private Outil outil;

	
	public RobotMenager2() {
		this.nom = "rafbot";
		RobotMenager2.brasRobotique = new BrasRobotique();
		//this.cuve = new Cuve(100);
		this.outil = Outil.COUPER; // Par défaut, on utilise le couteau
	}

	public RobotMenager2(String nom, BrasRobotique brasRobotique, Capteur capteur, Cuve cuve, Outil outil,
			Capteur[] capteurs) {
		this.nom = nom;
		RobotMenager2.brasRobotique = brasRobotique;
		this.cuve = cuve;
		this.outil = outil;
		this.capteur = capteur;

	}

	public void effectuerTache() {
		switch (outil) {
		case COUPER:
			brasRobotique.saisir(outil);
			brasRobotique.use(outil);
			brasRobotique.lacher(outil);
			break;
		case FOUET:
			brasRobotique.saisir(outil);
			brasRobotique.use(outil);
			brasRobotique.lacher(outil);
			break;
		case PETRIR:
			brasRobotique.saisir(outil);
			brasRobotique.use(outil);
			brasRobotique.lacher(outil);
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
		RobotMenager2.brasRobotique = brasRobotique;
	}

	public Capteur getCapteur() {
		return capteur;
	}

	public void setCapteur(Capteur capteur) {
		this.capteur = capteur;
	}

	public Cuve getCuve() {
		return cuve;
	}

	public void setCuve(Cuve cuve) {
		this.cuve = cuve;
	}

	public Outil getOutil() {
		return outil;
	}

	public void setOutil(Outil outil) {
		this.outil = outil;
	}

	public enum Outil {

		COUPER {

			public void use() {
				System.out.println("Utilisation du couteau pour couper");
				// code pour couper
			}
		},
		FOUET {

			public void use() {
				System.out.println("Utilisation du fouet pour mélanger");
				// code pour mélanger
			}
		},
		PETRIR {

			public void use() {
				System.out.println("Utilisation du pétrin pour pétrir");
				// code pour pétrir
			}
		};

		public abstract void use();

		public void saisir(Outil outil) {
			   brasRobotique.descendre();
			    brasRobotique.ouvrirPince();
			    brasRobotique.saisir(outil);
			    brasRobotique.fermerPince();
			    brasRobotique.remonter();
			}

		public void use(Outil outil) {
			// code pour utiliser l'outil avec le bras d urobot
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
}  


