package com.sprint.flight.management.ViewDetailsOfFlight.model;

import java.util.ArrayList;
import java.util.List;

public class FlightDetails {
    
	long flightid;
	String flightName;
	List<FlightSchedule> schedule=new ArrayList<FlightSchedule>();
	public long getFlightid() {
		return flightid;
	}
	public void setFlightid(long flightid) {
		this.flightid = flightid;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public List<FlightSchedule> getSchedule() {
		return schedule;
	}
	public void setSchedule(List<FlightSchedule> schedule) {
		this.schedule = schedule;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flightName == null) ? 0 : flightName.hashCode());
		result = prime * result + (int) (flightid ^ (flightid >>> 32));
		result = prime * result + ((schedule == null) ? 0 : schedule.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlightDetails other = (FlightDetails) obj;
		if (flightName == null) {
			if (other.flightName != null)
				return false;
		} else if (!flightName.equals(other.flightName))
			return false;
		if (flightid != other.flightid)
			return false;
		if (schedule == null) {
			if (other.schedule != null)
				return false;
		} else if (!schedule.equals(other.schedule))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "FlightDetails [flightid=" + flightid + ", flightName=" + flightName + ", schedule=" + schedule + "]";
	}
	public FlightDetails(long flightid, String flightName, List<FlightSchedule> schedule) {
		super();
		this.flightid = flightid;
		this.flightName = flightName;
		this.schedule = schedule;
	}
	

}
