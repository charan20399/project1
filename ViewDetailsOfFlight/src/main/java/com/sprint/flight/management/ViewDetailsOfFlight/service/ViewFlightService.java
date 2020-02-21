package com.sprint.flight.management.ViewDetailsOfFlight.service;

import java.util.List;

import com.sprint.flight.management.ViewDetailsOfFlight.model.FlightDetails;
import com.sprint.flight.management.ViewDetailsOfFlight.model.FlightSchedule;
import com.sprint.flight.management.ViewDetailsOfFlight.util.InvalidFlightIdEntryException;

public interface ViewFlightService {
     
	public FlightDetails getFlightById(long id) throws InvalidFlightIdEntryException;
	public List<FlightSchedule> getAllFlights();
}
