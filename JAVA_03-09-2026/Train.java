import java.util.Scanner;

class Train {
    private int trainNumber;
    private String source;
    private String destination;
    private int availableSeats;

    public Train(int trainNumber, String source, String destination, int availableSeats) {
        this.trainNumber = trainNumber;
        this.source = source;
        this.destination = destination;
        this.availableSeats = availableSeats;
    }

    public void bookTicket(int numSeats) {
        System.out.println("\n--- Booking Attempt: " + numSeats + " seats ---");
        
        if (numSeats <= 0) {
            System.out.println("Error: Invalid number of seats!");
            return;
        }

        if (availableSeats >= numSeats) {
            availableSeats -= numSeats; 
            System.out.println("Success: Successfully booked " + numSeats + " tickets!");
        } else {
            System.out.println("Failure: Not enough seats! Only " + availableSeats + " left.");
        }
    }

    public void displayTrainInfo() {
        System.out.println("\n===============================");
        System.out.println("       TRAIN DETAILS           ");
        System.out.println("===============================");
        System.out.println("Train Number    : " + trainNumber);
        System.out.println("Source          : " + source);
        System.out.println("Destination     : " + destination);
        System.out.println("Available Seats : " + availableSeats);
        System.out.println("===============================");
    }
}


