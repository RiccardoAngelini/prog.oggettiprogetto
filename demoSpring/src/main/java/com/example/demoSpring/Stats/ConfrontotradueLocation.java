package com.example.demoSpring.Stats;

public class ConfrontotradueLocation {

	 NumeriTweet location1;
	    NumeriTweet location2;
	    public ConfrontotradueLocation(NumeriTweet location1,NumeriTweet location2){
	        this.location1=location1;
	        this.location2=location2;
	    }
	    public NumeriTweet trovailmaxeilmin (NumeriTweet location1,NumeriTweet location2){
	        if(location1.findnumberofTweet(location1.generictweet, location1.distanza)> location2.findnumberofTweet(location2.generictweet, location2.distanza)){
	        return location1;
	        }
	        else
	            return location2;
	    }
	    }

