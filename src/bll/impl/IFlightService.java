package bll.impl;

import bean.Flight;

import java.sql.SQLException;
import java.util.Set;

public interface IFlightService {
    void insertFlight(Flight flight) throws SQLException;
    Set<Flight> getAllFlights() throws SQLException;
    Flight getFlightByDepartureTime(String departureTime);
    Flight getFlightByDepartureAirPort(String departureTime);
    Flight getFlightByDestinationAirPort(String departureTime);
    void updateFlight(Flight flight);
}
