package BetaAirlines;

public class Main {
    public static void main(String[] args) {
        ReservationManager reservationManager = new ReservationManager();
        //készítsünk utasokat
        Passenger pass1 = new Passenger("Jucika", 56345245);
        Passenger pass2 = new Passenger("Mártika", 76543654);
        //legyen pár foglalás
        Reservation res1 = new Reservation(5645345, "Budapest", "Varsó", 123);
        Reservation res2 = new Reservation(5645333, "Varsó", "Budapest", 111);
        Reservation res3 = new Reservation(564333, "Brüsszel", "Soros", 121);
        Reservation res4 = new Reservation(53335333, "Luxemburg", "Mezőtúr", 911);
        //utashoz tartozó List of reservations update-elni kell
        //adjunk hozzá foglalást és töröljünk is
        //adjunk hozzá foglalásokat
        reservationManager.addReservationToList(pass1, res1);
        reservationManager.addReservationToList(pass1, res2);
        reservationManager.addReservationToList(pass1, res3);
        reservationManager.addReservationToList(pass1, res4);
        reservationManager.addReservationToList(pass2, res3);
        reservationManager.addReservationToList(pass2, res4);

        reservationManager.itsStringyBitch(); //print
        //Új ötlet: meg kellen akadályozni, hogy egy key alatt ugyanaz a reservation kétszer szerepelhessen
        //mapbe kellene tenni a reservation-öket is? Map<utas, Map<Járatszám, List<mindenmás>>>
        //Nem overkill már ez?
        //vagy csak Set, de akkor felülírja az előzőt
        //út ötlet: csak annyi reservation lehet, ahány ülés LOL, but still nope!
        reservationManager.removeReservationFromList(pass1, res2);
        reservationManager.removeReservationFromList(pass2, res3);
        reservationManager.removeReservationFromList(pass2, res4);
//        reservationManager.removeReservationFromList(pass2, res4); nullpointerexception
        reservationManager.removeReservationFromList(pass2, res4); //javítva

        reservationManager.itsStringyBitch(); //print
    }
}
