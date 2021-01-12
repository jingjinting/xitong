package bean;

public class Flight {

    public Flight(String s,  String planeType, int currentSeatsNum, String departureAirPort, String departureTime, String departrueDate) {

        this.planeType = planeType;
        this.currentSeatsNum = currentSeatsNum;
        this.departureAirPort = departureAirPort;
        this.departureTime = departureTime;
        this.departrueDate = departrueDate;
    }


    @Override
    public String toString() {
        return "Flight{" +
                "planeType='" + planeType + '\'' +
                ", currentSeatsNum=" + currentSeatsNum +
                ", departureAirPort='" + departureAirPort + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", departrueDate='" + departrueDate + '\'' +
                '}';
    }

    private String id;
    private String planeType;//飞机型号
    private int currentSeatsNum;//空座位数量
    private String departureAirPort;//出发机场
    private String departureTime;//到达机场
    private String departrueDate;//出发时间

    public String getDepartrueDate() {
        return departrueDate;
    }

    public void setDepartrueDate(String departrueDate) {
        this.departrueDate = departrueDate;
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

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

}
