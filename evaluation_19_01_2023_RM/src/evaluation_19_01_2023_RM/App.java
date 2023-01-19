package evaluation_19_01_2023_RM;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		
		//VARIABLES
		
		int numero = 1;
		int mois = 1;
		int pair= 12%2;
		int impair = 11%3;
		int janvier = 1;			//string janvier ne fonctionne pas ..
		int  fevrier=2;int mars=3;int avril=4;int mai=5;int juin=6;int juillet=7;int aout=8;int septembre=9;int octobre = 10;int novembre =11 ; int  decembre = 12;
	
		// Debut de programme :
		
		while (numero <12 && numero >1); {
		(numero<=12);
		numero++;
		  System.out.println("Entrez un numero de mois compris entre 1 et 12 : ");
		  mois=sc.nextInt();
		  do {
			  if  (mois % 1 ==0)
			  numero = 1;
			 mois = janvier;
			  
		 	  if (mois % 2 ==0)
		 	   numero=2;
		  		mois= fevrier;
		  	  if (mois % 3 ==0)
		  	  numero=3;
		  	  mois = mars;
		  	if (mois % 2 ==0)
		  		numero = 4;
			  mois = avril;
			  if (mois % 3 ==0)
			  numero = 5;
			  mois = mai;
			  if (mois % 2 ==0)
			  numero = 6;
			  mois = juin;
			  if (mois % 3 ==0)
			  numero = 7;
			  mois = juillet;
			  if (mois % 2 ==0)
			  numero = 8;
			  mois = aout;
			  if (mois % 3 ==0)
			  numero = 9;
			  mois = septembre;
			  if (mois % 2==0)
			  numero = 10;
			  mois = octobre;
			  if (mois % 3 ==0)
			  numero = 11;
			  mois = novembre;
			  if (mois % 2 ==0)
			  numero = 12;
			  mois = decembre;
		 System.out.println(mois);
		  
		 
		}
		while (numero > 1 && numero <12);
		      System.out.println( numero + "n'est pas un mois  recommencé");
		    return;
		
		 }
		sc.close();
		  }  	 
	



	}
	
