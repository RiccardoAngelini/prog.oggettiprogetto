package com.example.demoSpring.Stats;

import java.util.Objects;

import org.apache.catalina.users.GenericRole;

import com.example.demoSpring.Model.GenericTweet;
import com.example.demoSpring.Utility.Distance;
import com.example.demoSpring.Utility.GetCoordinates;

/**
 * La seguente classe si occupa di contare il numero di tweet 
 * @author RiccardoAngelini
 *@author LeonardoDiPietro
 */

public class NumeriTweet {
	/**
	 * Attributi: appoggio,generictweet,coords,distanza
	 */

  Appoggio appoggio=new Appoggio();
  GenericTweet generictweet= appoggio.getGenerictweet();
  
  GetCoordinates cords= new GetCoordinates("Roma");
  Distance distanza=new Distance (cords.getCoordinates());
  private String input;

  public NumeriTweet(String input) {
	this.input=input;  
  }

/**
 * Il seguente metodo ad ogni iterazione incrementa il contatore se il generictweet viene trovato 
 * @param generictweet
 * @param input
 * @return Ritorna il numero di tweet in base alla distanza
 */
  public int findnumberofTweet (GenericTweet generictweet){
    int number=0;
    for(double i=0;i< distanza.findDistance(input) ;i++)
    {
      if(generictweet == null) //se l oggetto generictweet è vuoto il contatore dei tweet resta a 0
        number=number+0;
      else
        number=number +1; //se viene trovato l oggetto il numero dei tweet viene aumentato
    }
    return number;
}

}

class Appoggio
{
    GenericTweet generictweet;

  public GenericTweet getGenerictweet() {
    return generictweet;
  }
}

	
	
	
	

	
	