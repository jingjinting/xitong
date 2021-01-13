package dao;

import bean.Flight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

public class FlightDaoIml implements IFlightDao{
    @Override
    public void insertFlight(Flight flight) throws SQLException {
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Connection conn= DriverManager.getConnection(url,username,password);
        conn.setAutoCommit(false);
        String sql="INSERT INTO flight VALUES(?,?,?,?,?,?,?)";
        PreparedStatement pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,flight.getId());
        pstmt.setString(2,flight.getFlightId());
        pstmt.setString(3,flight.getPlaneType());
        pstmt.setInt(4,flight.getCurrentSeatsNum());
        pstmt.setString(5,flight.getDepartureAirPort());
        pstmt.setString(6, flight.getDestinationAirPort());
        pstmt.setString(7,flight.getDepartrueTime());
        pstmt.executeUpdate();
        conn.commit();

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
