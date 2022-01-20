package com.example.demoSpring.Filter;

import org.json.simple.JSONArray;

import org.json.simple.JSONObject;

import com.example.demoSpring.Exception.DataException;
import com.example.demoSpring.Exception.PlaceException;
import com.example.demoSpring.Model.GenericTweet;
import com.example.demoSpring.Model.GeoTweet;
import com.example.demoSpring.Model.Place;

/**
 * La seguente classe implementa l'interfaccia Filter
 * @author Riccardo Angelini
 * @author Leonardo Di Pietro
 *
 */

public class Placefilter implements Filter{

	/**
	 * Attributi: generictweet,place
	 */
	GenericTweet generictweet= new GenericTweet();
	String place;
	/**
	 * Costruttore 
	 * @param generictweet
	 * @param place
	 */
	public Placefilter(GenericTweet generictweet,String place) {
		
		this.generictweet= generictweet;
		this.place=place;
	}


	/**
	 * Il metodo filtra i tweet in base ad un luogo specifico
	 * @return il JSONObject filtrato
	 */
	public JSONObject getFilter() throws PlaceException {
	
		JSONObject obj = new JSONObject (); 
		
		JSONArray list= (JSONArray) obj.get("place");  
		
		for(Place pp : generictweet.getLocation()) {
			
		JSONObject place= new JSONObject();
		
		if(pp.getName()==null) throw new PlaceException("Luogo non presente nel tweet"); 
		
		if(pp.getName().equals(this.place)) { 
			
			obj.put("name", pp.getName()); 
			obj.put("Country",pp.getCountry() ); 
			obj.put("place_type", pp.getPlace_type());
			
			list.add(place);
		}
		}
		
		
		return obj;
	}
	
	
	
	
	
}
