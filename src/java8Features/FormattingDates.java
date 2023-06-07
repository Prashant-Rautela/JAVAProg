package java8Features;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class FormattingDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime ldt = LocalDateTime.now();
		String formattedDate = DateTimeFormatter.BASIC_ISO_DATE.format(ldt);
		System.out.println(formattedDate);  //20230524 //yearmonthdate
		
		String formattedDate1 = DateTimeFormatter.ISO_DATE.format(ldt);
		System.out.println(formattedDate1);  //2023-05-24 //year-month-date
		
		// Custom formatter
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
		System.out.println(format.format(ldt)); //24-May-2023
		
		
	}

}
