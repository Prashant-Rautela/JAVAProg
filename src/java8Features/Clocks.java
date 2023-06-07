package java8Features;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

public class Clocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clock clock = Clock.systemDefaultZone();  //to get default timezone of system
		System.out.println(clock);
		
		Instant instant = clock.instant();
		System.out.println(instant); //this print the instant time in UTC timezone
		
		Clock clock1 = Clock.systemUTC();  //to return clock in UTC timezone
		System.out.println(clock1.instant());
		
		// You can create your own clock based on any clock by adding hours.
		Clock clock2 = Clock.offset(clock, Duration.ofHours(4));
		System.out.println(clock2.instant());
	}

}
