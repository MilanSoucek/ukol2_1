import com.engeto.ja.computers.Guest;
import com.engeto.ja.computers.Room;
import com.engeto.ja.computers.Booking;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Guest guest1 =
                new Guest("Adela Malikova", LocalDate.of(1993,3,13));
        Guest guest2 =
                new Guest("Jana Dvoracka", LocalDate.of(1995, 5, 5));
//        List<Guest> guestList = new ArrayList<>();
        guest1.setName("Adela Malikova (1993-03-13)");
        guest2.setName("Jana Dvoracka (1995-05-05)");
//        guest1.setBirthdate("1993-03-13");
//        List<Guest> guestList = new ArrayList<>();
//        guestList.add(guest1);
//        guestList.add(guest2);
//        System.out.println(guestList);
        System.out.println(guest1.getName());
        System.out.println(guest2.getName());
//        System.out.println(guest1.getBirthdate("1993-03-13"));
//        guest1.getBirthdate("1993-03-13");
//        System.out.println(guest1.getBirthdate("1993-03-13"));
    }
//    public static void main(String[] args) {
//        Room room1 =
//                new Room("capacity 1, hasBalcony: true, hasSeaview: true, price: 1000");
//        Room room2 =
//                new Room("capacity 1, hasBalcony: true, hasSeaview: true, price: 1000");
//        Room room3 =
//                new Room("capacity 3, hasBalcony: false, hasSeaview: true, price: 2400");
//        List<Guest> guestList = new ArrayLinewst<>();
//        room1.setNname("1");
//        room2.setName("2");
//        room3.setName("3");
//    }
}