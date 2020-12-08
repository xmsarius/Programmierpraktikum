/** 
 * Hochschule Harz
 * Fachbereich Automatisierung und Informatik
 * Prof. Dr. Bernhard Zimmermann
 * 
 * LV "Programmierung 1" WiSe 2020
 *
 * Problem: 	Algorithmus, der für eine gegebene natürliche Zahl x die größte natür-liche Zahl berechnet, 
 * 				die kleiner oder gleich der Quadratwurzel von x ist.
 *     
 * @author Viktor Görbert
 * @version 1.0
 * 
 */


public class vollkommene_Zahl extends Environment {

  public static void main(String[] args) {
    new vollkommene_Zahl().mainProgram(args);
  }

  void mainProgram(String[] args) {
    
  	int input, teiler, divisor, ganzzahl_teiler, summe;
  	boolean ist_vollkommen;
  	
    System.out.print("Bitte eine Zahl X > 0 eingeben: ");
    input = stdin.readInt();
    
    teiler = 1; // starten bei 1
    ganzzahl_teiler = 0;
    summe = 0; 
    
    
    while(teiler < input) {
    	
    	divisor = input;
    	
    	// ganzahlteiler herausfinden mit minus Operation
    	while(divisor > 0) {
    	
    		divisor = divisor - teiler; // subtrahieren bis divisor gleich 0
    		
    	}
    	
    	if(divisor == 0) {
		
			summe = summe + teiler; // summe aus gefundenen ganzzahlteilern finden
			
		}
    	
    	teiler = teiler + 1; // nächste Zahl zum testen
    }
    
    // wenn summe gleich user input dann habem wir ganze Zahl gefunden
    if(summe == input) {
		System.out.println("Die Zahl " + input + " ist eine vollkommene Zahl.");
	}
	
	if(summe != input) {
		System.out.println("Die Zahl " + input + " ist keine vollkommene Zahl.");
	}
    
  }

} // vollkommene_Zahl
