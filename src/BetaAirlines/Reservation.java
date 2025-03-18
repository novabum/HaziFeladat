package BetaAirlines;

public class Reservation {
    private final Integer flightNum;
    private final String departure;
    private final String destination;
    private final Integer numberOfSeats;


    public Reservation(Integer flightNum, String departure, String destination, Integer numberOfSeats) {
        this.flightNum = flightNum;
        this.departure = departure;
        this.destination = destination;
        this.numberOfSeats = numberOfSeats;
    }

    public Integer getFlightNum() {
        return flightNum;
    }
}
