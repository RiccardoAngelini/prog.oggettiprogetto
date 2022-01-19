package com.uni.riccardo.demoSpring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demoSpring.Exception.PlaceException;
import com.example.demoSpring.Model.GenericTweet;
import com.example.demoSpring.Utility.UrlGenerator;

import junit.framework.TestCase;
import junit.framework.TestSuite;

@SpringBootTest
class DemoSpringApplicationTests extends TestCase {

	private GenericTweet tweet;
	private UrlGenerator url;
	
	//costruttore della classe 
	public DemoSpringApplicationTests(String name) { super (name); }
	
	//Metodo per inizializzare gli oggetti da testare
	public void setUp() throws Exception{
		tweet= new GenericTweet();
		url= new UrlGenerator("https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/api/1.1/search/tweets.json?");
	}
	
	//Metodo per distruggere quanto inzializzato
	public void tearDown() throws Exception {}
	
	
	 void testUrlGenerator() {
		assertEquals(url.craeteUrl("Roma", 2, "it"), "https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/api/1.1/search/tweets.json?q=Roma&count=2&lang=it");
		
	}
	
	
	
	
	
	
	
	
	public static Test suite() {
		TestSuite suite= new TestSuite();
		suite.addTest(new DemoSpringApplicationTests("testUrlGenerator") );
	    return (Test) suite;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	@Test
	void testPlaceException() {
		try {
		if(tweet.getLocation().isEmpty());
		fail("Deve generare una eccezione");
	
		}catch(PlaceException p) {}		
}
*/


}