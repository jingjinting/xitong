package bll.impl;

import bean.Flight;
import dao.FlightDaoIml;
import dao.IFlightDao;

import java.sql.SQLException;
import java.util.Set;

public class FlightServiceImpl implements IFlightService{
    IFlightDao iFlightDao;

    public FlightServiceImpl() {
        iFlightDao = new FlightDaoIml();
    }

    @Override
    public void insertFlight(Flight flight) throws SQLException {
        iFlightDao.insertFlight(flight);
    }

    @Override
    public Set<Flight> getAllFlights() throws SQLException {
        return iFlightDao.getAllFlights();
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
