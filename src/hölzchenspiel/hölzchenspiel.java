package h�lzchenspiel;

import java.util.Scanner;
/**
  * H�lzchenspiel
  * @author  Minh Khanh Nguyen
  * @date    03.11.15
  * @version 1.0
  */
 
 
public class h�lzchenspiel{
 
  public static void main(String[] args) {
    // ------ Variablen deklarieren ------
	int anzahlHoelzchen = 21;
	int spieler = 1;
	Scanner in = new Scanner(System.in);
	
 
    // ------ Programmablauf ------
	
	while(anzahlHoelzchen >= 0){
		int wegnehmen = 0;
		System.out.println("Spieler " + spieler + " wieviele H�lzer nimmst du? (1-3) ( Momentan " + anzahlHoelzchen + ")");
		 wegnehmen = in.nextInt();
		
		 anzahlHoelzchen = anzahlHoelzchen - wegnehmen;
		if(anzahlHoelzchen <= 0){
			System.out.println("Spieler " + spieler +" hat verloren");
		}
		
		if(spieler == 1){
			spieler = 2;
		}
		else{
			spieler = 1;
		}
		
	}
   } 
  }