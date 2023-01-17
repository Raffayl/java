package conway;

public class App {
public static void main(String[]args)
{
	System.out.println("suite de conway ! ");
	
	String valeurs = "1211";
	
	String chiffre = valeurs.substring(0, 1); // recupere le premier caracter de la chaine " valeurs"
	
	int occurences = 1;
	String resultat = "";
	
	for(int i = 0; i < valeurs.length(); i++) {
		String charactere = valeurs.substring(i, i+1);
		   if(chiffre.equals(charactere)) {
	           ++ occurences;

	        } else {
	            resultat = resultat + "" +occurences +""+ valeurs.substring(i-1,i);
	            chiffre = charactere;
	            occurences = 1;
	        }
	    }
	    resultat = resultat + "" +occurences +"";
	    System.out.println(resultat);
	}
	}