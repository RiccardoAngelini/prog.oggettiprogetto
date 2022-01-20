package com.example.demoSpring.Stats;

import java.time.LocalDate;

import org.json.simple.JSONObject;

import com.example.demoSpring.Model.GenericTweet;
import com.example.demoSpring.Model.Place;

/**
 * 
 * @author RiccardoAngelini
 *@author LeonardoDiPietro
 */

public class DayStats {
	/**
	 * Attributi: date, tweet
	 */
	private LocalDate date; 
    GenericTweet tweet= new GenericTweet();
	
	/**
	 * Costruttore
	 * @param date
	 * @param tweet
	 */
	public DayStats(LocalDate date, GenericTweet tweet) {
		super();
		this.date = date;
		this.tweet = tweet;
	}

	/**
	 * Il seguente metodo restituisce il numero di tweet che 
	 *vengono scritti nella stessa location nel giorno inserito
	 * @return ritorna il numero di tweet
	 */
     public int daystats() {
    	 
    	 int count=0; 
    	 
    	for( int i=0 ; i<tweet.getLocation().size(); i++) {
    		
    	if(tweet.getLocation().get(i)== tweet.getLocation().get(i++))
    			 count++; 
    			 
    		 }
    	 
    	 return count; 
     }
	

}
