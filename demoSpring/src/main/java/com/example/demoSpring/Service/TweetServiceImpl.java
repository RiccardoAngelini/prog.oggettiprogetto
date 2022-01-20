package com.example.demoSpring.Service;
import java.net.URL;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.example.demoSpring.Model.GenericTweet;
import com.example.demoSpring.Model.GeoTweet;
import com.example.demoSpring.Model.Place;
import com.example.demoSpring.Utility.DateParse;
import com.example.demoSpring.Utility.UrlGenerator;

/**
 * La seguente classe implementa l'interfaccia TweetService
 * @author Riccardo Angelini
 * @author Leonardo Di Pietro
 * 
 */

public class TweetServiceImpl implements TweetService {

	/**
	 * Attributi di di TweetServiceImpl : url , geolocal, location	
	 */
	 
	Vector<GeoTweet> geolocal = new Vector<GeoTweet>();
	Vector<Place> location= new Vector <Place>();
	
	/**
	 * Il metodo in questione legge riga per riga il JSON che espone tutti i dati di un tweet,
	 * dove la string url indica la chiamata api,
	 * successivamente prende le informazioni rilevanti e le salva nei vari campi del generictweet
	 * 
	 * @return il generictweet con i nuovi valori 
	 */

	@SuppressWarnings("unused")
	@Override
	public GenericTweet readJSON(String url) {
		JSONObject obj= new JSONObject();

		try {

			HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
			//stato = connection.getResponseCode(); // salvo in una variabile il response code

			InputStream inputstream = connection.getInputStream(); 
			String body=" ";
			String textline=" "; 
			//Crea un Buffer che ci permette di leggere il testo da InputStream che otteniamo da connection.

			try {
				BufferedReader in = new BufferedReader(new InputStreamReader(inputstream));

				/*StringBuilder body= new StringBuilder(); 
	     while((textline= in.readLine()) != null)
		 body.append(textline); 
				 */

				while((textline=in.readLine()) != null) 
					body+= textline; 
			}finally {
				inputstream.close(); 

			}
			obj = (JSONObject) JSONValue.parse(body);

		}catch(MalformedURLException mue) {
			mue.printStackTrace();

		} catch (IOException ioe) {

			//System.out.println(" STATO: " + stato);

			ioe.printStackTrace();
		}


		//assegno ai vari campi del generictweet le informazioni del json

		JSONArray list= (JSONArray) obj.get("statuses");


		DateParse dp= new DateParse(); 

		GenericTweet generictweet= new GenericTweet(); 


		JSONObject statuses = new JSONObject(); 

		generictweet.setCreatedAt(dp.dateParse((String)statuses.get("created_at")));
		generictweet.setId((long)statuses.get("id") );
		generictweet.setText((String)statuses.get("text"));


		JSONArray listelement= (JSONArray) obj.get("place");  
		//for(int i=0; listelement.size(); i++)
		//JSONObject place= (JSONObject) listelement.get(i);
		//vedere se è meglio far partire un for
		
		JSONObject place=new JSONObject(); 

		 
		Place pp= new Place ();  

		pp.setName((String)place.get("name"));
		pp.setCountry((String)place.get("country"));
		pp.setPlace_type((String)place.get("place_type"));
		location.add(pp); //aggiungo gli elementi al vettore di profile 

		//salvo il vettore  con il setter di generictweet assegnando i singoli attributi
		generictweet.setLocation(location); 


		JSONObject geo = new JSONObject(); 
		GeoTweet geotweet= new GeoTweet(); 
		
		geotweet.setCoord((String)geo.get("coordinates"));
		
		geotweet.setType((String)geo.get("type"));

		geolocal.add(geotweet);  

		return generictweet;

	}



	/**
	 * Il metodo riceve come parametro il generictweet "aggiornato" e costruisce un nuovo JSONObject
	 * @return il nuovo JSONObject con i dati di tweet rilevanti
	 */


	@SuppressWarnings("unchecked")
	@Override
	public JSONObject buildJSON(GenericTweet generictweet) {


		JSONObject obj= new JSONObject(); 


		// generictweeet
		/*
		JSONArray tweet = (JSONArray) obj.get("statuses"); 

		JSONObject statuses = new JSONObject();  

		statuses.put("created_at", generictweet.getCreatedAt()); 
		statuses.put("id", generictweet.getId()); 
		statuses.put("text", generictweet.getText()); 
*/
       

		JSONArray list= (JSONArray) obj.get("place");  

		for(Place pp : generictweet.getLocation()) {

			JSONObject place= new JSONObject();

			place.put("name", pp.getName());
			place.put("country", pp.getCountry()); 
			place.put("place_type",pp.getPlace_type());

			list.add(place);

		}


       
		JSONArray listelement= (JSONArray) obj.get("geo");
        
       for (GeoTweet geotweet : generictweet.getGeolocal()) {
		
        	
        JSONObject geo = new JSONObject(); 
		
		geo.put("coordinates", geotweet.getCoord()); 
		geo.put("type", geotweet.getType()); 

		listelement.add(geo);
		
        }
		return obj; 

	}








}





	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	


	