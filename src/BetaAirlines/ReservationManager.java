package BetaAirlines;

import java.util.*;

public class ReservationManager {
    Map<Passenger, List<Reservation>> reservationsMap = new HashMap<>();


    public void addReservationToList(Passenger passenger, Reservation reservation) {
        //megnézem, hogy van-e a passengernek már foglalási listája, ha nincs készítek újat.
        reservationsMap.computeIfAbsent(passenger, k -> new ArrayList<>()).add(reservation);
        //ha passenger absent, akkor key-> hez rendelünk new arraylistset) és hozzáadjuk a reservationt
        //ha passenger present, akkor csak hozzáadjuk reservationt.

        //HA a key tutira létezik, akkor ez is jó:
        // reservationsMap.get(passenger).add(reservation);
    }

    public void removeReservationFromList(Passenger passenger, Reservation reservation) {
        reservationsMap.computeIfPresent(passenger, (K, V) -> {
            V.remove(reservation);
            return V;
        });
        //Mi van ha nincs több reservation? Törölhető a key?
    }

    public void itsBritneyBitch() {
        for (Passenger passenger : reservationsMap.keySet()) {
            System.out.println("Name: " + passenger.getName());
            System.out.println("reservations: ");
            reservationsMap.get(passenger).stream().map(Reservation::getFlightNum).forEach(System.out::println);
        }
    }

}
