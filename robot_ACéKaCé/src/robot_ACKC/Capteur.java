
package robot_ACKC;

import ACKC.RobotMenager2.Outil;

public class Capteur {
	private Cuve cuve;
	private BrasRobotique brasRobotique;
	private Outil outil;
	private Capteur[] capteurs;

	public Capteur(Cuve cuve, BrasRobotique brasRobotique, Outil outil, Capteur[] capteurs) {
		this.cuve = cuve;
		this.brasRobotique = brasRobotique;
		this.outil = outil;
		this.capteurs = capteurs;
	}

	public boolean detecterObstacle() {
		for (Capteur capteur : capteurs) {
			double distance = capteur.getDistance();
			if (distance < 10) {
				System.out.println("Obstacle détecté");
				return true;
			}
		}
		System.out.println("Aucun obstacle détecté");
		return false;
	}

	private double getDistance() {
		
		return 0;
	}
}


