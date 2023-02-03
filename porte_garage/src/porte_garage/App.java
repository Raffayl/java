package porte_garage;

public class App {

	public static void main(String[] args) {
	PorteDeGarage p1 = new PorteDeGarage("veleda ","verte ","metal ",false,true) ;

	
	
	String porte = p1.toString();
System.out.println(porte);
	boolean ok = p1.ouvrirEntierement();
			}
}
