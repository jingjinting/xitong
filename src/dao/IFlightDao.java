package dao;

import bean.Flight;

import java.util.Set;

public interface IFlightDao {
    void insertFlight(Flight flight);
    Set<Flight>getAllFlights();
    Flight getFlightByDepartureTime(String departureTime);
    Flight getFlightByDepartureAirPort(String departureTime);
    Flight getFlightByDestinationAirPort(String departureTime);
    void updateFlight(Flight flight);

}
