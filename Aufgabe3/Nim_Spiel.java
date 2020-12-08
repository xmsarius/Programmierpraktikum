/** 
 * Hochschule Harz
 * Fachbereich Automatisierung und Informatik
 * Prof. Dr. Bernhard Zimmermann
 * 
 * LV "Programmierung 1" WiSe 2020
 *
 * Problem: 	Ein Nim Spiel entwickeln
 *     
 * @author Viktor Görbert
 * @version 1.0
 * 
 */


public class Nim_Spiel extends Environment {

  public static void main(String[] args) {
    new Nim_Spiel().mainProgram(args);
  }

  void mainProgram(String[] args) {
  
  	int gewinner, ergebnis, empty, r1, r2, r3, hoelzerGesamt, i, auswahlReihe, auswahlAnzahl;
  
  	gewinner = 0;
  	
  	i = 0; // Laufvariable
  	
  	// Abfrage um Spielfeld zu initialisieren
  	do {
  		System.out.println("Streichhoelzeranzahl der 1. Reihe: ");
  		r1 = stdin.readInt();
  	} while(r1 < 0);
  	
  	do {
		System.out.println("Streichhoelzeranzahl der 2. Reihe: ");
		r2 = stdin.readInt();
	} while(r2 < 0);
  	
  	do {
		System.out.println("Streichhoelzeranzahl der 3. Reihe: ");
		r3 = stdin.readInt();
	} while(r3 < 0);
  	
  	System.out.println("");
  	System.out.println("NIM-Spiel");
  	System.out.println("---------");
  	System.out.println("Streichhoelzeranzahl der 1. Reihe: " + r1);
  	System.out.println("Streichhoelzeranzahl der 2. Reihe: " + r2);
  	System.out.println("Streichhoelzeranzahl der 3. Reihe: " + r3);
  	
  	hoelzerGesamt = r1 + r2 + r3;
  	
  	// abweisende Spielschleife
  	while(hoelzerGesamt != 0) {
  		
	  	// Ausgabe Spielstand
	  	System.out.println("");
	  	System.out.println("Aktueller Spielstand");
	  	System.out.println("---------------------");
	  	
	  	
	  	System.out.print("1. Reihe: ");					// Reihe 1					
	  	
	  	i = 0;
	  	while(i < r1) {
	  	
	  		System.out.print("|");
	  		i++;
	  	}
	  	System.out.println();
	  	
	  	
	  	System.out.print("2. Reihe: ");					// Reihe 2
	  	
	  	i = 0;
	  	while(i < r2) {
	  	
	  		System.out.print("|");
	  		i++;
	  	}
	  	System.out.println();
  	
	  	
	  	System.out.print("3. Reihe: ");					// Reihe 3
	  	
	  	i = 0;
	  	while(i < r3) {
		  	
	  		System.out.print("|");
	  		i++;
	  	}
	  	System.out.println();
	  	
	  	System.out.println("");
	  	System.out.println("Sie sind am Zug.");
	  	
	  	// Spielzug Spieler
	  	// Spielzug Abfrage Reihe
	  	
	  	int anzahlCheck = 0;
	  	do {
	  		empty = 0;
	  		System.out.println("Aus welcher Reihe moechten Sie Streichhoelzer entnehmen? ");
	  		auswahlReihe = stdin.readInt();
	  		
	  		// keine leere Reihe wählen
	  		if(auswahlReihe == 1 &&  r1 == 0) {
	  			empty = 1;
	  			
	  		} else {
	  			if(auswahlReihe == 2 &&  r2 == 0) {
	  				empty = 1;
	  				
	  			} else {
		  			if(auswahlReihe == 3 &&  r3 == 0) {
		  				empty = 1;
		  				
		  			} 
	  			}
	  		}
	  	} while (!(auswahlReihe> 0 && auswahlReihe <4) || empty == 1);
	  	
	  	if(auswahlReihe == 1) {
	  		anzahlCheck = r1;
	  	} else if(auswahlReihe == 2){
	  		anzahlCheck = r2;
  		} else if(auswahlReihe == 3){
  			anzahlCheck = r3;
  		}
	  	// Spielzug Abfrage Anzahl
	   	do {
	   		System.out.println("Wieviele Streichhoelzer moechten Sie entnehmen? ");
	   		auswahlAnzahl = stdin.readInt();
	   		System.out.println(anzahlCheck);
	   	} while (!(auswahlAnzahl> 0 && auswahlAnzahl <= anzahlCheck));
	   	
	   	if(auswahlReihe == 1) {
	   		r1 = r1 - auswahlAnzahl;
	   	} else {
			if(auswahlReihe == 2) {
				r2 = r2 - auswahlAnzahl;
		   	} else {
		   		r3 = r3 - auswahlAnzahl;
		   	} 
	   	} 
	  	
	   	hoelzerGesamt = r1 + r2 + r3; // neue Gesamtanzahl berechnen für Abbruchbedingung
	   	
	   	// Ausgabe Spielstand
		System.out.println("");
	   	System.out.println("Aktueller Spielstand");
	   	System.out.println("---------------------");
	   	
	   	
	   	System.out.print("1. Reihe: ");					// Reihe 1					
	  	
	  	i = 0;
	  	while(i < r1) {
	  	
	  		System.out.print("|");
	  		i++;
	  	}
	  	System.out.println();
	  	
	  	
	  	System.out.print("2. Reihe: ");					// Reihe 2
	  	
	  	i = 0;
	  	while(i < r2) {
	  	
	  		System.out.print("|");
	  		i++;
	  	}
	  	System.out.println();
  	
	  	
	  	System.out.print("3. Reihe: ");					// Reihe 3
	  	
	  	i = 0;
	  	while(i < r3) {
		  	
	  		System.out.print("|");
	  		i++;
	  	}
	  	
	  	System.out.println();	
	  	
	   	if(hoelzerGesamt == 0) {
		   	// Spieler gewinnt
	   		gewinner = 1;
	   				
	   	} else {
			// Spielzug Computer
		   	System.out.println();
		   	System.out.println("Der Computer ist am Zug");
		   	
		   	ergebnis = r1 ^ r2 ^ r3;
		   	
		   	if(ergebnis == 0) {
		   		// Wartezug: aus beliebiger nicht leerer Reihe ein Holz nehmen
			   	if(r1 != 0) {
					r1 = r1 - 1;
				} else {
					if(r2 != 0) {
						r2 = r2 - 1;
					} else {
						r3 = r3 - 1;
					}
				}
		   	} else {
		   		// Gewinnerzug: (Ergebnis XOR anzahlReihe) kleiner als anzahlReihe? Dann setze anzahlReihe auf (Ergebnis XOR anzahlReihe)
		   		if((r1 ^ ergebnis) < r1) {
		   			r1 = (r1 ^ ergebnis);
		   		} else {
			   		if((r2 ^ ergebnis) < r2) {
			   			r2 = (r2 ^ ergebnis);
			   		} else {
			   			r3 = (r3 ^ ergebnis);
			   		}
		   		}
		   	}
	   	}
	   	
	   	hoelzerGesamt = r1 + r2 + r3;
	}
    
 	if(gewinner == 0) {
   		System.out.println("Der Computer hat das Spiel gewonnen!");
 	} else {
 		System.out.println("Du hast das Spiel gewonnen!");
 	}

    
  }
  
 
} // Nim_Spiel
