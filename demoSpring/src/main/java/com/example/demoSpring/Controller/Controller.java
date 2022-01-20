package com.example.demoSpring.Controller;

import java.time.LocalDate;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataLocation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSpring.Exception.DataException;
import com.example.demoSpring.Exception.PlaceException;
import com.example.demoSpring.Filter.Dayfilter;
import com.example.demoSpring.Filter.Placefilter;
import com.example.demoSpring.Model.GeoTweet;
import com.example.demoSpring.Service.TweetService;
import com.example.demoSpring.Service.TweetServiceImpl;
import com.example.demoSpring.Stats.ConfrontotradueLocation;
import com.example.demoSpring.Stats.NumeriTweet;
import com.example.demoSpring.Utility.Distance;
import com.example.demoSpring.Utility.GetCoordinates;
import com.example.demoSpring.Utility.UrlGenerator;

/**
 * Controller che gestisce le chiamate 
 * @author RiccardoAngelini
 * @author LeonardoDiPietro
 *
 */

@RestController
public class Controller {

/*@Autowired
private TweetService tweetService;
*/
	
  
	//@AutoWired
	@GetMapping(value="/distance")
    public ResponseEntity<Object> findDistance(){
	GeoTweet geo = new GeoTweet();
	
	GetCoordinates coord= new GetCoordinates("Roma");
    Distance distanza=new Distance(coord.getCoordinates());
      
	  return new ResponseEntity<>(distanza.findDistance(geo.getCoord()),HttpStatus.OK);
	}
	
	/*
	@GetMapping(value="/number")
	public ResponseEntity<Objects> getNumberofTweet(){
    
    TweetServiceImpl tweet= new TweetServiceImpl();
    UrlGenerator url = new UrlGenerator();
    GeoTweet geo = new GeoTweet();
    NumeriTweet numerotweet=new NumeriTweet(geo.getCoord());
    distanza=distanza.findDistance(geo.getCoord());
    		   return  ResponseEntity.OK(distanza);
	}
	*/
   

     
    /**
     * GET che prende i metadati
     * @return ritorna i dati importanti dei tweet
     */
      @GetMapping(value = "/metadati")
      public ResponseEntity<Object> metadata() {
    	  TweetServiceImpl tweet= new TweetServiceImpl();
    	    UrlGenerator url = new UrlGenerator();
    	    return new ResponseEntity<>(tweet.buildJSON(tweet.readJSON(url.craeteUrl("Roma", 3, "#travel#Roma"))), HttpStatus.OK);
      }
        	


    /**
     * GET che permette il filtragio del giorno 
     * @param day il giorno selezionato per filtraggio
	 * @param month il mese selezionato per filtraggio
	 * @param year l'anno selezionato per filtraggio
     * @return il JSONObject contenente i tweet filtrati
     * @throws DataException 
     */
    @GetMapping(value = "/filter/created_at")
    public ResponseEntity<Object> dayfilter(
    		@RequestParam(name = "day", required = false) Integer day, 
			@RequestParam(name = "month", required = false) Integer month,
			@RequestParam(name = "year", required = false) Integer year) throws DataException  
    {

		LocalDate date;
		if(day == null || month == null || year == null) {
			date = LocalDate.now();
		}
		else date = LocalDate.of(year,month,day);
    		
    TweetServiceImpl tweet= new TweetServiceImpl();
    UrlGenerator url = new UrlGenerator();
 
    Dayfilter dd = new Dayfilter(tweet.readJSON(url.craeteUrl("Roma", 2, "#travel" )),date);
    
    return new ResponseEntity<>(dd.getFilter(), HttpStatus.OK);
    		
}
    
    

    /**
     * GET che permette il filtraggio del luogo
     * @param place il luogo sul quale si vuole effettuare il filtraggio
     * @return ritorna il JSONObject contenente i tweet filtrati
     * @throws PlaceException
     */
    @GetMapping(value = "/filter/place")
    public ResponseEntity<Object> placefilter(
    		@RequestParam(name = "place") String place) throws PlaceException
    {
    	TweetServiceImpl tweet= new TweetServiceImpl();
        UrlGenerator url = new UrlGenerator();
        Placefilter pp= new Placefilter(tweet.readJSON(url.craeteUrl("Roma", 2, "#travel#Colosseo")),"Colosseo");
        return new ResponseEntity<>(pp.getFilter(), HttpStatus.OK);
    }
    
    
}
