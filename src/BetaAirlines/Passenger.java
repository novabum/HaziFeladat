package BetaAirlines;

public class Passenger {
    private String name;
    private Integer passportID;

    public Passenger(String name, Integer passportID) {
        this.name = name;
        this.passportID = passportID;
    }

    public String getName() {
        return name;
    }

}
