package ProgrammingWithClasses;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Train {
    private String destination;
    private int trainNumber;
    private String departureTime;

    public Train(String destination, int trainNumber, String departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public static void main(String[] args) {
        Train[] trains = new Train[5];
        trains[0] = new Train("Moscow", 123, "08:00");
        trains[1] = new Train("St. Petersburg", 456, "10:30");
        trains[2] = new Train("Moscow", 789, "12:45");
        trains[3] = new Train("Novosibirsk", 321, "14:15");
        trains[4] = new Train("St. Petersburg", 654, "16:20");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter train number to get information: ");
        int numberToFind = scanner.nextInt();

        boolean trainFound = false;
        for (Train train : trains) {
            if (train.getTrainNumber() == numberToFind) {
                System.out.println("Train Found:");
                System.out.println("Destination: " + train.getDestination());
                System.out.println("Train Number: " + train.getTrainNumber());
                System.out.println("Departure Time: " + train.getDepartureTime());
                trainFound = true;
                break;
            }
        }
        if (!trainFound) {
            System.out.println("Train not found");
        }

        Arrays.sort(trains, Comparator.comparing(Train::getDestination).thenComparing(Train::getDepartureTime));

        System.out.println("\nSorted Trains by Destination and Departure Time:");
        for (Train train : trains) {
            System.out.println("Destination: " + train.getDestination());
            System.out.println("Train Number: " + train.getTrainNumber());
            System.out.println("Departure Time: " + train.getDepartureTime());
            System.out.println("--------------");
        }
    }
}
