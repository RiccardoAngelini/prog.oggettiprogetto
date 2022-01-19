package com.example.demoSpring.Stats;

import com.example.demoSpring.Utility.Distance;



public class NumeriTweet {
	
	
	 Appoggio appoggio=new Appoggio();
	  Generictweet generictweet= appoggio.getGenerictweet();
	  Distance distanza;
	  String input;

	  public int findnumberofTweet (Generictweet generictweet,Distance distanza){
	    int number=0;
	    for(int i=0;i< distanza.findDistance(input);i++)
	    {
	      if(generictweet == null)
	        number=number+0;
	      else
	        number=number +1;
	    }
	    return number;
	}

	}

	class Appoggio
	{
	    Generictweet generictweet;

	  public Generictweet getGenerictweet() {
	    return generictweet;
	  }
	}

	class Generictweet {

	}

