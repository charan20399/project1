package com.sprint.flight.management.ViewDetailsOfFlight.service;

import java.util.List;

import com.sprint.flight.management.ViewDetailsOfFlight.dao.ViewFlightDao;
import com.sprint.flight.management.ViewDetailsOfFlight.dao.ViewFlightDaoImpl;
import com.sprint.flight.management.ViewDetailsOfFlight.model.FlightDetails;
import com.sprint.flight.management.ViewDetailsOfFlight.model.FlightSchedule;
import com.sprint.flight.management.ViewDetailsOfFlight.util.InvalidFlightIdEntryException;

public class ViewFlightServiceImpl implements ViewFlightService {
        
	ViewFlightDao dao=new ViewFlightDaoImpl();
	@Override
	public FlightDetails getFlightById(long id) throws InvalidFlightIdEntryException {
		  FlightDetails fd = dao.getFlightById(id);
		  if(fd==null) {
				throw new InvalidFlightIdEntryException("Flight not found with id : "+id);
			}
			return fd;
		
	}
	@Override
	public List<FlightSchedule> getAllFlights() {
		
		return dao.getAllFlights();
	}

	

}
