package com.example.demoSpring.Exception;

/**
 * Le classi contengono i metodi che si occupano di lanciare le eccezioni
 * @author RiccardoAngelini
 * @author LeonardoDiPietro
 *
 */

public class DataException extends Exception{

	/**
	 * Costruttore
	 */
	public DataException() {
		super(); 
		
	}
	/**
	 * 
	 * @param msg indica il messggio di errore
	 */
	
	public DataException(String msg){
		super(msg); 
		
	}
}
