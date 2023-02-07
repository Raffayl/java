package porte_garage;

public class App {

	public static void main(String[] args) {
		PorteDeGarage p1 = new PorteDeGarage(" veleda ", " verte ", " metal ", true, 0);
		PorteDeGarage p2 = new PorteDeGarage(" plasticbertrand ", " jaune ", " plastique ", false, 90);
		PorteDeGarage p3 = new PorteDeGarage(" allumatic ", " rouge ", " alluminium ", false, 90);
		PorteDeGarage p4 = new PorteDeGarage("caoupro ", " noire ", " caoutchouc ", true, 0);

		String porte1 = p1.toString();
		System.out.println(porte1);

		String porte2 = p2.toString();
		System.out.println(porte2);

		String porte3 = p3.toString();
		System.out.println(porte3);

		String porte4 = p4.toString();
		System.out.println(porte4);

		boolean ok3 = p1.deverouiller();
		System.out.println(ok3);

		boolean ok4 = p1.ouvrirEntierement();
		System.out.println(ok4);

		boolean ok = p1.fermerEntierement();
		System.out.println(ok);

		boolean ok1 = p1.verouiller();
		System.out.println(ok1);

		boolean ok2 = p2.fermerEntierement();
		System.out.println(ok2);

		boolean ok5 = p2.ouvrir(50);
		System.out.println(ok5);

		boolean ok6 = p2.fermer(50);
		System.out.println(ok6);

		boolean ok7 = p2.verouiller();
		System.out.println(ok7);
	}
}
