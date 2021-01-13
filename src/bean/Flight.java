package bean;

public class Flight {
    private String id;
    private String planeType;//飞机型号
    private String flightId;
    private int currentSeatsNum;//空座位数量
    private String departureAirPort;//出发机场
    private String destinationAirPort;//到达机场
    private String departrueTime;//出发时间

    public String getDepartrueTime() {
        return departrueTime;
    }

    public void setDepartrueTime(String departrueTime) {
        this.departrueTime = departrueTime;
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

    public Flight(String id, String planeType, String flightId, int currentSeatsNum, String departureAirPort, String destinationAirPort, String departrueTime) {
        this.id = id;
        this.planeType = planeType;
        this.flightId = flightId;
        this.currentSeatsNum = currentSeatsNum;
        this.departureAirPort = departureAirPort;
        this.destinationAirPort = destinationAirPort;
        this.departrueTime = departrueTime;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id='" + id + '\'' +
                ", planeType='" + planeType + '\'' +
                ", flightId='" + flightId + '\'' +
                ", currentSeatsNum=" + currentSeatsNum +
                ", departureAirPort='" + departureAirPort + '\'' +
                ", destinationAirPort='" + destinationAirPort + '\'' +
                ", departrueTime='" + departrueTime + '\'' +
                '}';
    }
}
