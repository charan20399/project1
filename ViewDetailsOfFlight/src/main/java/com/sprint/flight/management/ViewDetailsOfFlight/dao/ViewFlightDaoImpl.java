package com.sprint.flight.management.ViewDetailsOfFlight.dao;

import com.sprint.flight.management.ViewDetailsOfFlight.model.FlightDetails;
import com.sprint.flight.management.ViewDetailsOfFlight.model.FlightSchedule;

import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class ViewFlightDaoImpl implements ViewFlightDao {
	public static Map<Long, FlightDetails> flights=new HashMap<>();
	public ViewFlightDaoImpl() {
		
		addSomeFlights();
		
	}
	public static void addSomeFlights() {
		FlightDetails flight1=new FlightDetails(120356875446l, "Indigo",
				             Arrays.asList(new FlightSchedule("Hyderabad", "mumbai", 250, "7:00", "8:00")
						    ,new FlightSchedule("mumbai", "america", 2000, "15:00", "16:00")
						    ,new FlightSchedule("kolkata", "delhi", 300, "11:00", "12:00")));
		FlightDetails flight2=new FlightDetails(1587564286, "Lufthansa", 
				             Arrays.asList(new FlightSchedule("Hyderabad", "Bangolore", 500, "1:00", "2:00")
						    ,new FlightSchedule("Chennai", "hyderabad", 600, "6:00", "7:00")
						    ,new FlightSchedule("Mumbai","Hyderabad",400,"13:00","14:00")));
	     flights.put(flight1.getFlightid(), flight1);
	     flights.put(flight2.getFlightid(), flight2);
	}
	@Override
	public FlightDetails getFlightById(long id) {
		
		return flights.get(id);
	}
	@Override
	public List<FlightSchedule> getAllFlights() {
		List<FlightSchedule> f=new ArrayList<FlightSchedule>();
		for(long sd:flights.keySet())
		{
			f.addAll((Collection<? extends FlightSchedule>) flights.get(sd));
		}
		return f;
	}

}
