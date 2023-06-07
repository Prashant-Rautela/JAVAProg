package java8Features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Periods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LocalDate ldt1 = LocalDate.now();
		
		LocalDate ldt2 = LocalDate.of(2002, 05, 24);
		
		
		//to compare periods between two dates
		Period p1 = Period.between(ldt1, ldt2);
		System.out.println(p1);   //21Y   //21 year
		
		System.out.println(p1.getDays());  //0 if current date is 24
		
		
		// if you want to find number of days between two dates
		long numDaysBtwTwoDates = ChronoUnit.DAYS.between(ldt2, ldt1);
		
		System.out.println(numDaysBtwTwoDates);
		
		// Modify dates and times.
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("Current date time is: " + ldt);
		LocalDateTime ldt3=
		
				//add 4 days in date time.
		//ldt.plusDays(4);
		
		//add minutes
		//ldt.plusMinutes(10);
		
		
		
		ldt.withMonth(9); //this method will alter only 9 months keeping other parts intact.
		//System.out.println("Current date time after adding 4 days: " + ldt3.getDayOfMonth());
		System.out.println("Current date time after adding 4 days: " + ldt3);
	}

}
