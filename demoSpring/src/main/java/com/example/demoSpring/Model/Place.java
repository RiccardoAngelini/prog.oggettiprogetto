package com.example.demoSpring.Model;

/**
 * La classe Place rappresenta i parametri del luogo indicati nel tweet
 * 
 * 
 * @author Riccardo Angelini
 * @author Leonardo Di Pietro
 * 
 */


public class Place {
	
	
	/**
	 * Attributi di Place: name, place_type, country
	 */
	
	private String name; 
	
	private String place_type; 
	
	private String country;
	
	
	/**
	 * @param name è il nome del luogo
	 * @param place_type indica il tipo di luog 
	 * @param country è lo stato 
	 * 
	 */

	
	
	/**
	 * Il metodo ritorna il nome del luogo come stringa
	 * @return name
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Il metodo ritorna il tipo di luogo come stringa
	 * @return place_type
	 */

	public String getPlace_type() {
		return place_type;
	}

	public void setPlace_type(String place_type) {
		this.place_type = place_type;
	}

	
	/**
	 * Il metodo ritorna il country come stringa
	 * @return country 
	 */
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	} 
	
	
	
}
