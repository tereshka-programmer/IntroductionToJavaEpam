package ProgrammingWithClasses;

import java.util.Arrays;

public class AirlineArray {
    private Airline[] airlines;

    public AirlineArray(Airline[] airlines) {
        this.airlines = airlines;
    }

    public void printFlightsByDestination(String destination) {
        for (Airline airline : airlines) {
            if (airline.getDestination().equalsIgnoreCase(destination)) {
                System.out.println(airline);
            }
        }
    }

    public void printFlightsByDayOfWeek(String dayOfWeek) {
        for (Airline airline : airlines) {
            String[] daysOfWeek = airline.getDaysOfWeek();
            for (String day : daysOfWeek) {
                if (day.equalsIgnoreCase(dayOfWeek)) {
                    System.out.println(airline);
                    break;
                }
            }
        }
    }

    public void printFlightsByDayOfWeekAndDepartureTime(String dayOfWeek, String departureTime) {
        for (Airline airline : airlines) {
            String[] daysOfWeek = airline.getDaysOfWeek();
            String airlineDepartureTime = airline.getDepartureTime();
            if (Arrays.asList(daysOfWeek).contains(dayOfWeek) && airlineDepartureTime.compareTo(departureTime) > 0) {
                System.out.println(airline);
            }
        }
    }

    public static void main(String[] args) {
        Airline airline1 = new Airline("New York", "AA123", "Boeing 737", "10:00",
                new String[]{"Monday", "Wednesday", "Friday"});
        Airline airline2 = new Airline("London", "BA456", "Airbus A320", "14:30",
                new String[]{"Tuesday", "Thursday"});
        Airline airline3 = new Airline("Paris", "AF789", "Boeing 747", "18:45",
                new String[]{"Wednesday", "Saturday"});
        Airline airline4 = new Airline("Tokyo", "JL234", "Boeing 777", "21:15",
                new String[]{"Monday", "Wednesday", "Friday", "Saturday"});
        Airline airline5 = new Airline("Berlin", "LH567", "Airbus A380", "09:30",
                new String[]{"Tuesday", "Thursday", "Saturday"});

        Airline[] airlines = {airline1, airline2, airline3, airline4, airline5};

        AirlineArray airlineArray = new AirlineArray(airlines);

        System.out.println("Flights to destination 'London':");
        airlineArray.printFlightsByDestination("London");

        System.out.println();

        System.out.println("Flights on Monday:");
        airlineArray.printFlightsByDayOfWeek("Monday");

        System.out.println();

        String dayOfWeek = "Wednesday";
        String departureTime = "12:00";
        System.out.println("Flights on " + dayOfWeek + " with departure time after " + departureTime + ":");
        airlineArray.printFlightsByDayOfWeekAndDepartureTime(dayOfWeek, departureTime);
    }
}