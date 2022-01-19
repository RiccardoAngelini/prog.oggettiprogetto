package com.example.demoSpring.Filter;

import org.json.simple.JSONObject;

import com.example.demoSpring.Exception.DataException;
import com.example.demoSpring.Exception.PlaceException;
import com.example.demoSpring.Model.GenericTweet;
import com.example.demoSpring.Model.GeoTweet;

/**
 * Interfaccia utilizzata ai fini dei filtri, contiene un solo metodo astratto: getFilter
 * 
* @author RiccardoAngelini
*@author LeonardoDiPietro
 */

public interface Filter{
	
/*	
protected GenericTweet generictweet;
public Filter(GenericTweet generictweet) {
	this.generictweet=generictweet;
}
*/
	
/**
 * 	
 * @return Ritorna il JSONObject filtrato
 * @throws DataException lancia un'eccezione se la data di creazione non è presente nel tweet
 * @throws PlaceException lancia un'eccezione se il luogo non è oresente nel tweet
 */
	
public JSONObject getFilter() throws DataException, PlaceException; 


	
}
