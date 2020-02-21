package com.sprint.flight.management.ViewDetailsOfFlight.dao;

import java.util.List;

import com.sprint.flight.management.ViewDetailsOfFlight.model.FlightDetails;
import com.sprint.flight.management.ViewDetailsOfFlight.model.FlightSchedule;

public interface ViewFlightDao{
	
	public FlightDetails getFlightById(long id);
	public List<FlightSchedule> getAllFlights();

}
