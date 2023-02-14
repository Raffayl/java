package Robot;

public class App {

	public static void main(String[] args) {

		Robot robi = new Robot();

		System.out.println(robi);

		robi.avancer(1);
		System.out.println(robi);

		robi.tournerADroite(45);
		System.out.println(robi);

		robi.reculer(2);
		System.out.println(robi);

		robi.tournerAGauche(600000);
		System.out.println(robi);
	}

}
