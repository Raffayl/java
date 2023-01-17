package comparaison;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	
		Scanner Sc=new Scanner(System.in);

		//declaration de variables

		int age;
		
		// DEBUT DE PROGRAMME
		
		System.out.println("entrez votre age :");
		age =Sc.nextInt();
            if(age>17){

        System.out.println("vous êtes majeur");
		                           }
            else if (age<1) {
	    System.out.println("vous êtes pas né");   
		            }
            else {
    	System.out.println("vous êtes mineur");  
		            }
            Sc.close();
	}
	//FIN DE PROGRAMME
	
}
