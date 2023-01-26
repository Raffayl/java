package moyenne_fonction;


	import java.util.Scanner;

	public class App {
	    public static double moyenne(double num1, double num2) {
	        return (num1 + num2) / 2;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Entrez le premier nombre : ");
	        double num1 = sc.nextDouble();
	        System.out.print("Entrez le deuxième nombre : ");
	        double num2 = sc.nextDouble();
	        
	        double moyenne = moyenne(num1, num2);
	        System.out.println("La moyenne des deux nombres est : " + moyenne);
	        sc.close();
	    }
	}


