package test70000decimale;

import java.math.BigDecimal;

public class App {
	
  public static void main(String[] args) {
	  
    BigDecimal e = new BigDecimal(Math.E); // créer un objet BigDecimal pour e
    BigDecimal e70000 = e.setScale(70000, BigDecimal.ROUND_HALF_UP); // arrondir e à 70000 décimales
    System.out.println(e70000); // afficher e70000
  }
}