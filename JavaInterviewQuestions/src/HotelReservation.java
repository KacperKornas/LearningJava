import java.util.HashMap;

public class HotelReservation {
    public static void main(String[] args) {
        HotelReservationSystem hotel = new HotelReservationSystem();

        hotel.bookRoom(1, "Donald");
        hotel.bookRoom(2, "Melania");
        hotel.bookRoom(2, "Elon");
        hotel.bookRoom(8, "Elon");
        hotel.bookRoom(9, "Taylor");
        hotel.showList();

        hotel.cancelReservation(8);
        hotel.cancelReservation(2);
        hotel.showList();

        System.out.println(hotel.checkReservation(1));
        System.out.println(hotel.checkReservation(2));

    }
}

class HotelReservationSystem {
    HashMap<Integer, String> reservationList;

    public HotelReservationSystem() {
        this.reservationList = new HashMap<>();

        for (int i = 1; i <= 10; i++) {
            reservationList.put(i, "Empty");
        }
    }

    boolean bookRoom(int roomNumber, String name) {
        if (reservationList.get(roomNumber) == "Empty") {
            reservationList.put(roomNumber, name);
            return true;
        } else return false;
    }

    boolean cancelReservation(int roomNumber) {
        if (reservationList.get(roomNumber) == "Empty") return false;
        else {
            reservationList.put(roomNumber, "Empty");
        } return true;
    }

    String checkReservation(int roomNumber) {
        if (reservationList.get(roomNumber) == "Empty") return null;
        else return reservationList.get(roomNumber);
    }

    void showList() {
        System.out.println("\n");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Room " + i + ": " + reservationList.get(i));
        }
        System.out.println("\n");
    }
}