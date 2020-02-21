package com.sprint.flight.management.ViewDetailsOfFlight.ui;
import com.sprint.flight.management.ViewDetailsOfFlight.model.FlightDetails;
import com.sprint.flight.management.ViewDetailsOfFlight.model.FlightSchedule;

//import com.sprint.flight.management.ViewDetailsOfFlight.service.ViewFlightService;
//import com.sprint.flight.management.ViewDetailsOfFlight.service.ViewFlightServiceImpl;
import java.util.Scanner;

import com.sprint.flight.management.ViewDetailsOfFlight.service.ViewFlightService;
import com.sprint.flight.management.ViewDetailsOfFlight.service.ViewFlightServiceImpl;
import com.sprint.flight.management.ViewDetailsOfFlight.util.InvalidFlightIdEntryException;
//import com.sprint1.fms1.model.ScheduleDetails;

public class FlightDetailsUi {
     
	static ViewFlightService service=new ViewFlightServiceImpl();
	static Scanner in= new Scanner(System.in);
	public static void main(String[] args) {
		for(;;) {
			int choice;
			System.out.println("Enter your choice : ");
			System.out.println("1 - Get Flight Info");
			System.out.println("3 - All flight details are :");
			System.out.println("2 - Exit");
			choice=in.nextInt();
			switch (choice) {
			case 1:
				getFlightById();
            	break;
			case 2:
				System.out.println("List of All Flights :");
	    		for(FlightSchedule sd:service.getAllFlights()) {
	    			System.out.println(sd);
	    			}
	    		
	    		break;
	    	case 3:		
				System.out.println("exit Successful");
				System.exit(0);

			default:
				break;
			}

	}

	}
	private static void getFlightById() {
		
		System.out.println("enter flight id  :");
		long id=in.nextLong();
		try {
		 FlightDetails flight= service.getFlightById(id);
		 System.out.println("Flight id :"+flight.getFlightid());
		 System.out.println("Flight name is :"+flight.getFlightName());
			if(flight!=null) {
				flight=service.getFlightById(id);
				System.out.println(flight);
							}
		}
		catch(Exception e) {
			System.out.println("Error : "+e.getMessage());
		}
	}
}