package Robot;

import java.util.Random;

public class Robot {

	private String nomRobot;
	public boolean estAllumer;
	public boolean peutSeDeplacer;
	private boolean avecCargaison;

	public enum Deplacement {
		AVANT, ARRIERE, GAUCHE, DROITE;
	}

	public boolean allumerRobot() {
		if (this.estAllumer == false) {
			this.estAllumer = true;
			return true;
		} else {
			return false;
		}
	}

	public boolean eteindreRobot() {
		if (this.estAllumer == true) {
			this.estAllumer = false;
			return true;
		} else {
			return false;
		}
	}

	public boolean seDeplacer() {
		int distance = calculerDistance();
	
		if (this.estAllumer) {
			if (distance < 10) {
				this.peutSeDeplacer = false;
				return false;
			} else {
				this.peutSeDeplacer = true;
				return true;
			}
		} else {
			return false;
		}

	}

	public String deplacer(Deplacement move) {
		this.peutSeDeplacer = this.seDeplacer();
		String str = "";
		if (this.peutSeDeplacer && this.estAllumer) {
			switch (move) {
			case AVANT: {
				str = "Le robot avance";
				break;
			}
			case ARRIERE: {
				str = "Le robot recule";
				break;
			}
			case GAUCHE: {
				str = "Le robot tourne a gauche";
				break;
			}
			case DROITE: {
				str = "Le robot tourne a droite";
				break;
			}
			default: {
				break;
			}
			}
		} else {
			this.peutSeDeplacer = false;
			str = "le robot ne peut pas se deplacer.";

		}

		return str;
	}

	public boolean chargerCargaison() {
		if (!this.avecCargaison && this.estAllumer) {
			this.avecCargaison = true;
			return true;
		} else {
			return false;
		}
	}

	public boolean dechargerCargaison() {
		if (this.avecCargaison&& this.estAllumer) {
			this.avecCargaison = false;
			return true;
		} else {
			return false;
		}

	}

	public Robot(String _nomRobot) {
		this.nomRobot = _nomRobot;
		this.estAllumer = false;
		this.peutSeDeplacer = false;
		this.avecCargaison = false;
	}

	public String getname() {
		return this.nomRobot;
	}

	public void setname(String _nomRobot) {
		this.nomRobot = _nomRobot;
	}

	private int calculerDistance() {
		Random rand = new Random();
		final int borneMin = 0;
		final int borneMax = 100;
		int distance = rand.nextInt(borneMax - borneMin + 1) + borneMin;
		return distance;
	}

	@Override
	public String toString() {
		String str = "Nom du robot : " + this.nomRobot + "\n" + "etat d'allumage : " + (this.estAllumer) + "\n"
				+ "Capacite de deplacement : " + (this.peutSeDeplacer) + "\n" + "Charge : " + (this.avecCargaison)
				+ "\n";
		return str;
	}

	

}