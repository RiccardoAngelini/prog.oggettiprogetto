package com.example.demoSpring.Filter;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

import org.json.simple.JSONObject;

import com.example.demoSpring.Exception.DataException;
import com.example.demoSpring.Model.GenericTweet;
import com.example.demoSpring.Model.GeoTweet;
import com.example.demoSpring.Service.TweetServiceImpl;

/**
 * La seguente classe implementa l'interfaccia Filter
 * @author Riccardo Angelini
 * @author Leonardo Di Pietro
 *
 */

public class Dayfilter implements Filter{
    /**
     * Attributi: generictweet, date
     */
	
    GenericTweet generictweet= new GenericTweet();
	LocalDate date; 
	
	/**
	 * Costruttore
	 * @param generictweet
	 * @param date
	 */
	public Dayfilter(GenericTweet generictweet,LocalDate date) {
		this.generictweet=generictweet;
		this.date=date;
	}

    /** 
     * Il metodo filtra i tweet in base alla data inserita
     * @return ritorna il JSONObject filtrato
     */
	@Override
	public JSONObject getFilter() throws DataException {
		// TODO Auto-generated method stub
		JSONObject obj= new JSONObject(); 
		
		
		if(generictweet.getCreatedAt()==null) throw new DataException("Data non presente nel tweet");
		
		
	if ( generictweet.getCreatedAt().compareTo(date)==0) {
		
	   obj.put("created_at", generictweet.getCreatedAt()); 
	   obj.put("id", generictweet.getId()); 
	   obj.put("text", generictweet.getText()); 

	}
	    
	return  obj; 
		
	}
	
	
}
