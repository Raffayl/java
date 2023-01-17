package boucle;

public class App {
	/**
	 * Afficher tous les nombres de 1 a 100 en remplacant les multiples de 7 par
	 * "bzz" et les multiples de 5 par "biz"
	 */
	public static void main(String[] args) {
		int indice = 1;
		while (indice <= 100) {

			if (indice % 7 == 0) {
				System.out.println("Bzz");
			} else if (indice % 5 == 0) {
				System.out.println("Biz");
			} else {
				System.out.println(indice);
			}
			indice++;
		}
	}
}
