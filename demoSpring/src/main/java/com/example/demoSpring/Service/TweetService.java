package com.example.demoSpring.Service;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.example.demoSpring.Model.GenericTweet;
import com.example.demoSpring.Model.GeoTweet;
import com.example.demoSpring.Utility.UrlGenerator; 

/**
 * La seguente classe espone i dati relativi al geo di twitter
 * @author Riccardo Angelini
 * @author Leonardo Di Pietro
 * 
*/


public interface TweetService {
	
	/**
	 * Metodo che legge il JSON
	 * @return GenericTweet 
	 */
public abstract GenericTweet readJSON(); 

/**
 * Il metodo prende il GenericTweet e costruisce un JSONObject
 * @param generictweet
 * @return il JSONObject con i dati rilevanti di un tweet
 */
public abstract JSONObject buildJSON(GenericTweet generictweet);

	
	
	
}
