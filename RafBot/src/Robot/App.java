package Robot;

public class App {
	public static void main(String[] args) {
		Robot monRobot = new Robot("NoName");

		System.out.println("Etat initial du robot :");
		System.out.println(monRobot.toString());

		monRobot.allumerRobot();
		monRobot.setname("RafBot");
		monRobot.deplacer(Robot.Deplacement.AVANT);
		System.out.println(monRobot.deplacer(Robot.Deplacement.AVANT));
		monRobot.chargerCargaison();

		System.out.println("\n Etat actuel du robot :");
		
		System.out.println(monRobot.toString());

		monRobot.dechargerCargaison();

		monRobot.deplacer(Robot.Deplacement.AVANT);
		System.out.println(monRobot.deplacer(Robot.Deplacement.AVANT));
		
		
		monRobot.deplacer(Robot.Deplacement.GAUCHE);
		System.out.println(monRobot.deplacer(Robot.Deplacement.GAUCHE));
		
		monRobot.deplacer(Robot.Deplacement.DROITE);
		System.out.println(monRobot.deplacer(Robot.Deplacement.DROITE));
		
		monRobot.deplacer(Robot.Deplacement.AVANT);
		monRobot.eteindreRobot();

		System.out.println("\n Etat final du robot :");
	
		System.out.println(monRobot.toString());

		
	}
}
