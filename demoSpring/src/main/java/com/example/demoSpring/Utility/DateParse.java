package com.example.demoSpring.Utility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * La classe effettua il parse della data fornita dal tweet sotto forma di stringa
 * @author Riccardo Angelini
 * @author Leonardo Di Pietro
 *
 */

public class DateParse {
     
	/*public DateParse() {} 
	*/
	/**
	 * 
	 * @param created_at indica la data inserita nel tweet sotto forma di stringa
	 * @return ritorna il parse della stringa 
	 */
	public LocalDate dateParse(String created_at) {
		LocalDate date;
		
		DateTimeFormatter formatt= DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss Z yyyy"); 
		LocalDateTime datetime= LocalDateTime.parse(created_at,formatt);
		
		date= datetime.toLocalDate(); 
		
		return date; 
	}
	
}

