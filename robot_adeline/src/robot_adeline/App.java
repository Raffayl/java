package robot_adeline;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		Robot robot = new Robot();

		System.out.println("telecommande pour le robot " + robot.nomRobot + " !");
		System.out.println("Les commandes disponibles sont :");
		System.out.println("1. allerAgauche");
		System.out.println("2. allerAdroite");
		System.out.println("3. monter");
		System.out.println("4. descendre");
		System.out.println("5. retournerAuDepart");
		System.out.println("6. prelever");
		System.out.println("7. deposer");

		boolean quit = false;
		while (!quit) {
			System.out.print("Choisissez une commande : ");
			int commande = sc.nextInt();

			switch (commande) {
			case 1:
				robot.allerAgauche(robot.correspondanceLettresPositionX() - 1);
				break;
			case 2:
				robot.allerAdroite(robot.correspondanceLettresPositionX() + 1);
				break;
			case 3:
				System.out.print("Entrez la position Y : ");
				int positionY = sc.nextInt();
				robot.monter(positionY);
				break;
			case 4:
				System.out.print("Entrez la position Y : ");
				positionY = sc.nextInt();
				robot.descendre(positionY);
				break;
			case 5:
				robot.setPositionX("A");
				robot.setPositionY(1);
				break;
			case 6:
				robot.colisSurRobot = true;
				System.out.println("Le colis a été pris.");
				break;
			case 7:
				robot.colisSurRobot = false;
				System.out.println("Le colis a ete depose.");
				break;
			default:
				quit = true;
				break;
			}
		}
		System.out.println("Merci d'avoir utilisé la telecommande pour le robot " + robot.nomRobot + " !");
	sc.close();
	}
	
}
