package com.example.demoSpring.Stats;

/**
 * La seguente classe calcola il numero di tweet rispetto a due location
 * @author RiccardoAngelini
 *@author LeonardoDiPietro
 *
 */

public class ConfrontotradueLocation {
	
/**Attributi: location1,location2,input
 * 
 */
	
	 NumeriTweet location1;
	    NumeriTweet location2;
	   private String input;
	    /**
	     * Costruttore
	     * @param location1
	     * @param location2
	     */
	    public ConfrontotradueLocation(NumeriTweet location1,NumeriTweet location2){
	        this.location1=location1;
	        this.location2=location2;
	    }
	    /**
	     * QUesto metodo ricerca il massimo di tweet che vengono fatti in due locatoion
	     * @param location1
	     * @param location2
	     * @return Ritorna la location con più tweet
	     */
	    public NumeriTweet trovailmaxeilmin (NumeriTweet location1,NumeriTweet location2){
	        if(location1.findnumberofTweet(location1.generictweet)> location2.findnumberofTweet(location2.generictweet)){
	        return location1;
	        }
	        else
	            return location2;
	    }
	    }

