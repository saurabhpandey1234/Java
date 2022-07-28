package org.test.spring.service;

import java.util.List;

import org.test.spring.Model.Flight;


public interface FlightService {

	Flight saveflight(Flight flight);
	
	// to read the flight record
	List<Flight> getAllflight();

	// to read single emp
	Flight getFlightById(long id);
}
