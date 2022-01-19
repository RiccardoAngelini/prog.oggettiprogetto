package com.example.demoSpring.Utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
/**
 * GetCoordinates prende le coordinate di una città in input
 * @author RiccardoAngelini
 * @author LeonardoDiPietro
 *
 */

public class GetCoordinates {
	/**
	 * Attributi di GetCoordinates: city,coord,input 
	 */
	
	private Vector<String> city=new Vector<String>();
	private Vector<String> coord= new Vector<String>();
	private String input;
	
	/**
	 * Costruttore
	 */
	public GetCoordinates(String input) {
		this.input=input;
	}
	
	
	/**
	 * Questo metodo il file city.txt contenente alcune città italiane con le loro coordinate 
	 * e le assegna a due vettori paralleli, dopodichà restituisce le coordinate della città inserita
	 * @return Ritorna le coordinate(latitudine e longitudine) sotto froma di stringa
	 */
	public String getCoordinates() {
		
		try {
		Scanner file_input = new Scanner(new BufferedReader(new FileReader("city.txt"))); 
		
		while(file_input.hasNext()) {
			city.add(file_input.next()); 
			coord.add(file_input.next()); 
			}
		file_input.close();
		
	}catch(IOException e) {
		System.out.println("Errore di IO"); 
		System.out.println(e); 
		
	}
	
		for(int i=0 ; i<city.size(); i++) {
			
			if(city.get(i)==input)
				return coord.get(i);
		}
		
		return null;
	
	
	}
	
	
	
	

}

