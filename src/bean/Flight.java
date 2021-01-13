package bean;

public class Flight {
    private String id;
    private String planeType;//飞机型号
    private String flightId;
    private int currentSeatsNum;//空座位数量
    private String departureAirPort;//出发机场
    private String destinationAirPort;//到达机场
    private String departureTime;//出发时间

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public int getCurrentSeatsNum() {
        return currentSeatsNum;
    }

    public void setCurrentSeatsNum(int currentSeatsNum) {
        this.currentSeatsNum = currentSeatsNum;
    }

    public String getDepartureAirPort() {
        return departureAirPort;
    }

    public void setDepartureAirPort(String departureAirPort) {
        this.departureAirPort = departureAirPort;
    }

    public String getDestinationAirPort() {
        return destinationAirPort;
    }

    public void setDestinationAirPort(String destinationAirPort) {
        this.destinationAirPort = destinationAirPort;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public Flight(String id, String planeType, String flightId, int currentSeatsNum, String departureAirPort, String destinationAirPort, String departureTime) {
        this.id = id;
        this.planeType = planeType;
        this.flightId = flightId;
        this.currentSeatsNum = currentSeatsNum;
        this.departureAirPort = departureAirPort;
        this.destinationAirPort = destinationAirPort;
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Flight{" +
                ", 航班ID='" + flightId + '\'' +
                ", 机型='" + planeType + '\'' +
                ", 座位数=" + currentSeatsNum +
                ", 起飞机场='" + departureAirPort + '\'' +
                ", 目的机场='" + destinationAirPort + '\'' +
                ", 起飞时间='" + departureTime + '\'' +
                '}';
    }
}
