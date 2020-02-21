package com.sprint.flight.management.ViewDetailsOfFlight.ui;
import com.sprint.flight.management.ViewDetailsOfFlight.model.FlightDetails;
import com.sprint.flight.management.ViewDetailsOfFlight.model.FlightSchedule;

//import com.sprint.flight.management.ViewDetailsOfFlight.service.ViewFlightService;
//import com.sprint.flight.management.ViewDetailsOfFlight.service.ViewFlightServiceImpl;
import java.util.Scanner;

import com.sprint.flight.management.ViewDetailsOfFlight.service.ViewFlightService;
import com.sprint.flight.management.ViewDetailsOfFlight.service.ViewFlightServiceImpl;
import com.sprint.flight.management.ViewDetailsOfFlight.util.InvalidFlightIdEntryException;

public class FlightDetailsUi {
     
	static ViewFlightService service=new ViewFlightServiceImpl();
	static Scanner in= new Scanner(System.in);
	public static void main(String[] args) {
		for(;;) {
			int choice;
			System.out.println("Enter your choice : ");
			System.out.println("1 - Get Flight Info");
//			System.out.println("2 - AccountSummary Info");
//			System.out.println("3 - Add Amount and show PassbookInfo");
			System.out.println("2 - Exit");
			choice=in.nextInt();
			switch (choice) {
			case 1:
				getFlightInfo();
//				System.out.println("enter flight Id :");
//				long id=in.nextLong();
//				try {
//					
//					service.getFlightById(id);
//				} catch (InvalidFlightIdEntryException e) {
//					
//					System.out.println("Error :"+e.getMessage());
//				}
//				break;
			case 2:
				System.out.println("exit Successful");
				System.exit(0);

			default:
				break;
			}

	}

	}
	private static void getFlightInfo() {
		
		System.out.println("enter flight id  :");
		long id=in.nextLong();
		try {
		 FlightDetails details= service.getFlightById(id);
			if(details==null) {
				System.out.println("Flight id :"+details.getFlightid());
				System.out.println("Flight name is :"+details.getFlightName());
				details=service.getFlightById(id);
				details.getSchedule();
			}
		}
		catch(Exception e) {
			System.out.println("Error : "+e.getMessage());
		}
	}
}