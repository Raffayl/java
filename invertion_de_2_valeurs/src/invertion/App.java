package invertion;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// invertion de 2 nombres

		int a, b, tmp;
	      System.out.print("Entrez deux nombres: ");
	      Scanner Sc = new Scanner(System.in);
	     
	      a = Sc.nextInt();
	      b = Sc.nextInt();
	     
	      System.out.println("Avant la permutation: a = "+a+" et b = "+b);
	     
	      tmp = a;
	      a = b;
	      b = tmp;
	     
	      System.out.println("Aprés la permutation: a = "+a+" et b = "+b);
	      Sc.close();
	}
		
}
