package UI;

import bean.Flight;
import bll.impl.IFlightService;

import java.util.Set;

public class MainUI implements IFlightService {
    @Override
    public void insertFlight(Flight flight) {

    }

    @Override
    public Set<Flight> getAllFlights() {
        return null;
    }

    @Override
    public Flight getFlightByDepartureTime(String departureTime) {
        return null;
    }

    @Override
    public Flight getFlightByDepartureAirPort(String departureTime) {
        return null;
    }

    @Override
    public Flight getFlightByDestinationAirPort(String departureTime) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}