package exemple_conversion_de_type;


import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double km; 
		String quit = "q";
		String km_str;
		boolean fermeture_prog = false;
		Scanner sc = new Scanner(System.in);
		
		
		
		while(!fermeture_prog) {
			km_str = sc.nextLine();
			//test de comparaison de type string
			if(km_str.equals(quit))
			{
				fermeture_prog = true;
			}
			else
			{
				//conversion d'une variable de type string en type double
				km = Double.parseDouble(km_str);
			}
		}
		
	}

}

