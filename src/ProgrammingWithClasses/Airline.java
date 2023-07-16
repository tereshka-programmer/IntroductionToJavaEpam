package ProgrammingWithClasses;
import java.util.Arrays;

public class Airline {
    private String destination;
    private String flightNumber;
    private String aircraftType;
    private String departureTime;
    private String[] daysOfWeek;

    public Airline(String destination, String flightNumber, String aircraftType, String departureTime,
                   String[] daysOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.daysOfWeek = daysOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String[] getDaysOfWeek() {
        return daysOfWeek;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", aircraftType='" + aircraftType + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", daysOfWeek=" + Arrays.toString(daysOfWeek) +
                '}';
    }
}