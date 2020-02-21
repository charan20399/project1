package com.sprint.flight.management.ViewDetailsOfFlight.service;

import com.sprint.flight.management.ViewDetailsOfFlight.model.FlightDetails;
import com.sprint.flight.management.ViewDetailsOfFlight.util.InvalidFlightIdEntryException;

public interface ViewFlightService {
     
	public FlightDetails getFlightById(long id) throws InvalidFlightIdEntryException;
}
