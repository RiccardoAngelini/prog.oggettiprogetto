package JunitTest;

import static org.junit.jupiter.api.Assertions.*;


import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;

import com.example.demoSpring.Exception.PlaceException;
import com.example.demoSpring.Model.GenericTweet;
import com.example.demoSpring.Utility.UrlGenerator;


import junit.framework.TestSuite;

class Test {
	
	private GenericTweet tweet;
	private UrlGenerator url;
	
	
	public void setUp() throws Exception,PlaceException{
		tweet= new GenericTweet();
		url= new UrlGenerator("https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/api/1.1/search/tweets.json?");
	}
	
	//Metodo per distruggere quanto inzializzato
	public void tearDown() throws Exception {}
	
	
	@org.junit.jupiter.api.Test
	 void testUrlGenerator() {
		assertEquals(url.craeteUrl("Roma", 2, "it"), "https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/api/1.1/search/tweets.json?q=Roma&count=2&lang=it");	
	}
	

	void testData() {
		
	}
	
	
	@org.junit.jupiter.api.Test
	void test() {
		fail("Not yet implemented");
	}
	

	
	
}
	
	/*
	@org.junit.jupiter.api.Test
	void testPlaceException() {
	try{
		if(tweet.getLocation().isEmpty());
		fail("Deve generare una eccezione");
		}catch(PlaceException p) {}	
		}
*/

