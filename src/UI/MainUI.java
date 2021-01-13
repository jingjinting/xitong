package UI;

import bean.Flight;
import bll.impl.FlightServiceImpl;
import bll.impl.IFlightService;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

public class MainUI implements IFlightService {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
            System.out.println("请输入相应的数字进行操作:");
            System.out.println("按1，录入航班信息");
            System.out.println("按2，显示所有航班信息");
            System.out.println("按3，查看航班信息");
            System.out.println("按4，机票预定");
            System.out.println("按5，机票退改");
            System.out.println("按6，退出系统");
            int choice = sc.nextInt();
            if (choice == 1) {
                String id = UUID.randomUUID().toString().replace("-", "");
                System.out.println("请输入航班编号：");
                String flightId = sc.next();
                System.out.println("请输入机型:");
                String planeType = sc.next();
                System.out.println("请输入座位数:");
                int currentSeatsNum = sc.nextInt();
                System.out.println("请输入起飞机场:");
                String departureAirPort = sc.next();
                System.out.println("请输入目的机场：");
                String destinationAirPort = sc.next();
                System.out.println("请输入起飞时间:");
                String departureTime = sc.next();
                Flight flight = new Flight(id, planeType, flightId, currentSeatsNum, departureAirPort, destinationAirPort, departureTime);
                IFlightService iFlightService = new FlightServiceImpl();
                iFlightService.insertFlight(flight);
            }
        }

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
