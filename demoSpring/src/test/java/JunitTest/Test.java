package JunitTest;

import static org.junit.jupiter.api.Assertions.*;


import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;

import com.example.demoSpring.Exception.PlaceException;
import com.example.demoSpring.Model.GenericTweet;
import com.example.demoSpring.Utility.UrlGenerator;


import junit.framework.TestSuite;

class Test {
	
	
	private UrlGenerator url;
	
	
	public void setUp() throws Exception,PlaceException{
		
		url= new UrlGenerator();
	}
	
	//Metodo per distruggere quanto inzializzato
	public void tearDown() throws Exception {}
	
	
	@org.junit.jupiter.api.Test
	 void testUrlGenerator() {
		assertEquals(url.craeteUrl("Roma", 2, "#travel"), "https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/api/1.1/search/tweets.json?q=Roma&count=2&q=#travel");	
	}
	

	void testData() {
		
	}
	
	
	@org.junit.jupiter.api.Test
	void test() {
		fail("Not yet implemented");
	}
	


	
	@org.junit.jupiter.api.Test
	void testPlaceException() {
	try{
		if(tweet.getLocation().isEmpty());
		fail("Deve generare una eccezione");
		}catch(PlaceException p) {}	
		}
}

