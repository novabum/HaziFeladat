package BetaAirlines;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReservationManager {
    Map<Passenger, List<Reservation>> reservationsMap = new HashMap<>();


    public void addReservationToList(Passenger passenger, Reservation reservation) {
        if (!reservationsMap.containsKey(passenger)) {
            System.out.println("User does not exist. Adding " + passenger.getName() + "... Done");
            reservationsMap.put(passenger, new ArrayList<>());

        }
        reservationsMap.get(passenger).add(reservation);
        System.out.println("Reservation added");
    }

    //Ha van olyan reservation, akkor törli. Ha utolsó reservation volt, usert is törli. Ez két külön method lesz
    public void removeReservationFromList(Passenger passenger, Reservation reservation) {
        if (reservationsMap.containsKey(passenger)) {
            //a .remove simán egész key-t is törölné hmmm...
            reservationsMap.get(passenger).remove(reservation);
            System.out.println("Reservation found. Deleting.... Done");
        } else System.out.println("Reservation cannot be found."); //nincs a listában
        deleteUserIfNoReservationsLeft(passenger);
    }

    //ha nincs több reservation, töröljük a usert.
    private void deleteUserIfNoReservationsLeft(Passenger passenger) {
        if (!reservationsMap.containsKey(passenger)) {
            //hibakezelés miatt, ugyanis, isEmpty elfossa magát, ha nincs ilyen passenger
        } else if (reservationsMap.get(passenger).isEmpty()) { //törlést követően, az utolsó elemmel a usert is törli
            reservationsMap.remove(passenger);
            System.out.println("No more reservations, deleting " + passenger.getName() + "... Done");
        }
    }

    public void justPrint() {
        for (Passenger passenger : reservationsMap.keySet()) {
            System.out.println("Name: " + passenger.getName());
            System.out.println("reservations: ");
            reservationsMap.get(passenger).stream().map(Reservation::getFlightNum).forEach(System.out::println);
        }
    }

    public void addReservationToListAlternateVersion(Passenger passenger, Reservation reservation) {
        //megnézem, hogy van-e a passengernek már foglalási listája, ha nincs készítek újat.
        reservationsMap.computeIfAbsent(passenger, k -> new ArrayList<>()).add(reservation);
        //ha a passenger absent, akkor key-> hez rendelünk new arraylist-et) és hozzáadjuk a reservationt
        //ha a passenger present, akkor csak hozzáadjuk reservationt.
        //HA a key tutira létezik, akkor ez is jó:
        // reservationsMap.get(passenger).add(reservation);
        //csekkolom egy másik verzióban
//
    }

    public void removeReservationFromListAlternateVersion(Passenger passenger, Reservation reservation) {
        reservationsMap.computeIfPresent(passenger, (K, V) -> {
            V.remove(reservation);
            return V;
        });
        //!!! szép, de hogyan lehetne megoldani a user törlést és az üzenetek dobálását ugyanígy?
    }

    public void listPassangersOnFlight(Integer flightNumber){

    }
}
