package java8Features;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class ZoneDates {

	public static void main(String[] args) {
		for (String zoneid : ZoneId.getAvailableZoneIds()) {
			System.out.println(zoneid); // to return all available zone ids
			ZoneId zoneid1 = ZoneId.of(zoneid);

			// To find out the display name of each zone id.
			String displayname = zoneid1.getDisplayName(TextStyle.FULL, Locale.US);
			System.out.println(displayname);

		}

		// Initialise zone id
		ZoneId zid1 = ZoneId.of("US/Pacific");
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		System.out.println(ldt.getHour());

		ZonedDateTime zdt = ZonedDateTime.of(ldt, zid1);
		System.out.println(zdt.getHour());
		{
		}

	}
}
