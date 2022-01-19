package com.example.demoSpring.Exception;
/**
 * Le classi contengono i metodi che si occupano di lanciare le eccezioni
 * @author RiccardoAngelini
 * @author LeonardoDiPietro
 *
 */

public class PlaceException extends Exception {

	/**
	 * Costruttore
	 */
	public PlaceException() {
		super(); 
		
	}
	/**
	 * 
	 * @param msg Il messaggio di errore
	 */
	
	public PlaceException(String msg){
		super(msg); 
		
	}
	
}