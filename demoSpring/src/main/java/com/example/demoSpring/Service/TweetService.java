package com.example.demoSpring.Service;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.example.demoSpring.Model.GenericTweet;
import com.example.demoSpring.Model.GeoTweet;
import com.example.demoSpring.Utility.UrlGenerator; 

/**
 * Interfaccia che viene utilizzata ai fini della chiamata e per restituire i dati dei tweet
 * contiene due metodi astratti: readJSON e buildJSON
 * @author Riccardo Angelini
 * @author Leonardo Di Pietro
*/


public interface TweetService {
	
	/**
	 * Metodo che legge il JSON
	 * @return GenericTweet 
	 */
public abstract GenericTweet readJSON(String url); 

/**
 * Il metodo prende il GenericTweet e costruisce un JSONObject
 * @param generictweet
 * @return il JSONObject con i dati rilevanti di un tweet
 */
public abstract JSONObject buildJSON(GenericTweet generictweet);

	
	
	
}
