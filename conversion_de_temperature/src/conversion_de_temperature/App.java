package conversion_de_temperature;

import java.util.Scanner;

public class App {
		

		
		  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    // Demande de la température à convertir
		    System.out.print("Entrez la temperature a convertir : ");
		    double temperature = sc.nextDouble();

		    // Demande de l'unité de la température (C ou F)
		    System.out.print("Entrez l'unité de la temperature (C ou F) : ");
		    String unit = sc.next();

		    double convertedTemperature;
		    String convertedUnit;
		    if (unit.equals("C") || unit.equals("c")) {
		      // Conversion de Celsius en Fahrenheit
		      convertedTemperature = (temperature * 9 / 5) + 32;
		      convertedUnit = "F";
		    } else {
		      // Conversion de Fahrenheit en Celsius
		      convertedTemperature = (temperature - 32) * 5 / 9;
		      convertedUnit = "C";
		    }

		    // Affichage du résultat
		    System.out.println(temperature + "°" + unit + " = " + convertedTemperature + "°" + convertedUnit);
		  }
		}


