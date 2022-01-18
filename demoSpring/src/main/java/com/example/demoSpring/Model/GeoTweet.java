package com.example.demoSpring.Model;

import java.util.Vector;

/**
 * La seguente classe espone i dati relativi al geo di twitter
 * 
 * @author Riccardo Angelini
 * @author Leonardo Di Pietro
 * 
 */

public class GeoTweet {

	/**
	 * Attributi di GeoTweet: coord , type
	 */
 
	
     Vector<Double> coord= new Vector<Double>(); 
      private String type;
      
      /**
       * @param coord è il vettore che contiene coordinate di un tweet (latitudine e longitudine)
       * @paramm type indica come viene geolocalizzata la posizione ad es: 
       * Point ( segna un'unica coppia di coordinate)
       * Polygon( segna una quaterna di coordinate )
       */
      
      
      
     
    /*Sistema Sessagesimale ( 41° 52' 24'' N ; 12° 30' E (ROMA))
    * private short gradi; 
     * private short primi; 
     * private short secondi;
     * private char pcard; 
     Sistema decimale (41,89 N ; 12,57 E)
     * private double dec; 
     * private char pcard;  
    */
    	
      
      
      /**
       * Il metodo restituisce il vettore delle coordinate come vettore di double
       * @return coord
       */
	
	public Vector<Double> getCoord() {
		return coord;
	}

/**
 * Il metodo restituisce il tipo di geolocalizzazione come stringa
 * @return type
 */
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void setCoord(Vector<Double> coord) {
		this.coord = coord;
	}


	
	
	
}
