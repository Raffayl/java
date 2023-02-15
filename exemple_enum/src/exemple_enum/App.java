package exemple_enum;

import exemple_enum.Enum_exemple.language;

public class App {

	public static void main(String[] args) {

		language l1 = language.JAVA;
		language l2 = language.Cplus;

		System.out.println("J'aime le " + l1.getName() + " et j'utilise l'editeur  " + l1.getediteur() + "\n " + l2);
	}

}