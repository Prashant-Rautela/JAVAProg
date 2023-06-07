package java8Features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class LocalDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  LocalDate date = LocalDate.now();
		  System.out.println(date);
		  
		  LocalTime ltime = LocalTime.now();
		  System.out.println(ltime.of(12, 30));
		  ltime.atDate(date);
		  System.out.println(ltime);
		  
		 
		// 

	}

}
