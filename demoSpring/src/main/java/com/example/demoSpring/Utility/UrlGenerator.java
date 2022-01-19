package com.example.demoSpring.Utility;

/**
 *La classe viene utilizzata per creare l'url per effettuare chiamate api 
 * @author RiccardoAngelini
 * @author LeonardoDiPietro
 */

public class UrlGenerator  {
/**
 * Contiene un singolo attributo: url 
 */
	
	private String url="https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/api/1.1/search/tweets.json?"; 
	
	/*
	public UrlGenerator(String url) {
		this.url=url;
	}
	*/
	
	/**
	 * 
	 * @param city il nome della città relativa al tweet
	 * @param count il numero di tweet
	 * @param hashtag ai fini del nostro progetto è consigliato inserire degli hashtag per favorire dei tweet geolocalizzati
	 * @return Ritorna l'url da utilizzare per le chiamate immettendo i vari parametri
	 */
	public String craeteUrl (String city, int count , String hashtag) {
			
	
		
			url+= ("q="+ city); 
			
			url+=("&count"+ count); 
			
			url+=("&#travel"+hashtag); 
			
			return url;
		}
		
	}



