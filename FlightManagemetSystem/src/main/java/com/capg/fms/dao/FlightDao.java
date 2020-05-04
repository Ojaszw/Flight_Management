package com.capg.fms.dao;

import java.util.List;

import com.capg.fms.model.Flight;

public interface FlightDao {

	public Flight addFlight(Flight f);
	public Flight modifyFlight(Flight f);
	public Flight viewFlight(long fno);
	public List<Flight> viewFlight();
	public void deleteFlight(long fno);
	
}
