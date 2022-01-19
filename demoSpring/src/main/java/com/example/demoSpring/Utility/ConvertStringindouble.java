package com.example.demoSpring.Utility;

/**
 * Questa classe effettua il parse della latitudine e longitudine
  * @author Riccardo Angelini
 * @author Leonardo Di Pietro
 */


public  class ConvertStringindouble
{
	/**
	 * Attributi: latitude, longitude
	 */
    private String latitude;
    private String longitude;
    /**
     * Costruttore
     * @param latitude
     * @param longitude
     */
    
    public ConvertStringindouble(String latitude, String longitude)
    {
        this.latitude=latitude;
        this.longitude=longitude;
    }
    
    /**
     * Effettua il parse della latitudine
     * @param latitude
     * @return Ritorna la latitudine come double
     */
    public double conversionLatitude(String latitude)
    {
        double lati =Double.parseDouble(latitude);
        return lati;
    }
    
    /**
     * Effettua il parse della longitudine
     * @param longitude
     * @return ritorna la longitudine come double 
     */
    public double  conversionLongitude(String longitude)
    {
        double  longi=Double.parseDouble(longitude);
        return longi;
    }
}


