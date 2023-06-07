package java8Features;

import java.time.LocalDate;

public class comparesClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate ldt1 = LocalDate.now();
		System.out.println("value of firstime" + ldt1);
		
		LocalDate ldt2 = LocalDate.of(2023, 05, 25);
		System.out.println("Value of second date: " + ldt2);
		
		
		// if date and month is same, it will return year difference --> day different--> month difference.
		System.out.println(ldt1.compareTo(ldt2));
		
		System.out.println("is before? :" + ldt1.isBefore(ldt2));
		
		System.out.println("is after? :" + ldt1.isAfter(ldt2));
		
		System.out.println("is equal? :" + ldt1.isEqual(ldt2));
		
		System.out.println("is leap year? :" + ldt1.isLeapYear());
		

	}

}
