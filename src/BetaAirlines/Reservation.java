package BetaAirlines;

public class Reservation {
    private final Integer flightNum;


    public Reservation(Integer flightNum, String departure, String destination, Integer numberOfSeats) {
        this.flightNum = flightNum;
    }

    public Integer getFlightNum() {
        return flightNum;
    }
}
