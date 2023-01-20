import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        System.out.println("Hello world!");

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);


        System.out.println("Room number: ");
        int number = sc.nextInt();

        System.out.println("Check-in date (dd/MM/yyyy): ");
        LocalDate checkIn = LocalDate.parse(sc.next(), fmt);


        System.out.println("Check-out date (dd/MM/yyyy): ");
        LocalDate checkOut = LocalDate.parse(sc.next(), fmt);

        try {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println(reservation);


            System.out.println("Enter data to update the reservation: ");
            System.out.println("Check-in date (dd/MM/yyyy): ");
            checkIn = LocalDate.parse(sc.next(), fmt);
            System.out.println("Check-out date (dd/MM/yyyy): ");
            checkOut = LocalDate.parse(sc.next(), fmt);

            reservation.updateDates(checkIn, checkOut);

        }
        catch (ReservationException e) {
            System.out.println("Error in reservation: " + e.getMessage());

        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }





        sc.close();
    }
}