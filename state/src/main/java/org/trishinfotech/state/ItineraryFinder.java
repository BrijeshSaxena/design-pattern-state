package org.trishinfotech.state;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ItineraryFinder {

	public static List<Location> findItinerry(Location originLocation, Location destinationLocation) {
		// hard-coded itinerary locations to keep the code simple.
		return Arrays.stream(new Location[] { originLocation,
				new Location("LocB", "335 Hall Street", "Pelham", "AL", "US", "35124"),
				new Location("LocC", "409 Gates St.", "Hightstown", "NJ", "", "08520"),
				new Location("LocD", "540 Cemetery Street", "Brooklyn", "NY", "US", "11203"), destinationLocation })
				.collect(Collectors.toList());
	}

}
