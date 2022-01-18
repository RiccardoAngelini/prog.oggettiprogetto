package com.example.demoSpring.Model;


import java.time.LocalDate;
import java.util.Vector;

/**
 * La seguente classe rappresenta i parametri generici di un tweet
 * 
 * 
 * @author Riccardo Angelini
 * @author Leonardo Di Pietro
 */

public class GenericTweet{
	
/**
 * Attributi di GenericTweet: localdate, id , text
 * 
 */
	
   
	private LocalDate localdate; 
	private long id ; 
	private String text; 
	
	private Vector<Place> location= new Vector<Place>(); 
	private Vector<GeoTweet> geolocal = new Vector<GeoTweet>();
	
	
	/**
	 * @param localdate indica la data di creazione 
	 * @param id è l'identificativo
	 * @param text rappresenta il testo del tweet
	 */
	
	
/*
	public GenericTweet(String createdAt, long id , String text)
	{
		this.createdAt= createdAt; 
		this.id=id; 
		this.text=text; 
		
	}
*/
	

	
	/**
	 * Metodo che restituisce la data di creazione secondo il formato LocalDate
	 * @return localdate
	 */

	public LocalDate getCreatedAt() {
		return localdate;
	}


	public void setCreatedAt(LocalDate localdate) {
		this.localdate = localdate;
	}

	/**
	 * Metodo che restituisce un vettore di Place
	 * @return location
	 */
	
	public Vector<Place> getLocation() {
		return location;
	}



	public void setLocation(Vector<Place> location) {
		this.location = location;
	}

	/**
	 * Metodo che restituisce un vettore di GeoTweet
	 * @return geolocal
	 */
 
	public Vector<GeoTweet> getGeolocal() {
		return geolocal;
	}



	public void setGeolocal(Vector<GeoTweet> geolocal) {
		this.geolocal = geolocal;
	}

	/**
	 * Metodo che restituisce l'id come long
	 * @return id
	 */

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	/**
	 * Metodo che restituisce il text come stringa
	 * @return text
	 */
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
	
	

}
