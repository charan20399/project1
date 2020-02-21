package com.sprint.flight.management.ViewDetailsOfFlight.service;

import com.sprint.flight.management.ViewDetailsOfFlight.dao.ViewFlightDao;
import com.sprint.flight.management.ViewDetailsOfFlight.dao.ViewFlightDaoImpl;
import com.sprint.flight.management.ViewDetailsOfFlight.model.FlightDetails;
import com.sprint.flight.management.ViewDetailsOfFlight.util.InvalidFlightIdEntryException;

public class ViewFlightServiceImpl implements ViewFlightService {
        
	ViewFlightDao dao=new ViewFlightDaoImpl();
	@Override
	public FlightDetails getFlightById(long id) throws InvalidFlightIdEntryException {
		  FlightDetails fd=dao.getFlightById(id);
		  if(fd==null) {
				throw new InvalidFlightIdEntryException("Flight not found with id : "+id);
			}
			return fd;
		
	}

	

}
