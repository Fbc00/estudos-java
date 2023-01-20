import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TreeMap;

public class Reservation {
    private Integer numberRoom;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy");
    public Reservation(Integer numberRoom, LocalDate checkIn, LocalDate checkOut) throws ReservationException {

        if(!checkOut.isAfter(checkIn)) {
            throw new ReservationException("Check-out date must be after check-in date");
        }
        this.numberRoom = numberRoom;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public  Duration duaratoinDays() {
        return Duration.between(this.checkIn.atStartOfDay(), this.checkOut.atStartOfDay());
    }
    public void updateDates(LocalDate checkIn, LocalDate checkOut) throws ReservationException {
        LocalDate agora = LocalDate.now();
        if(checkOut.isBefore(agora) || checkIn.isBefore(agora)) {
            throw new ReservationException("Reservation dates for update must be future dates");
        }
        else if(checkOut.isBefore(checkIn)) {
            throw new  ReservationException("Error in reservation: Check-out date must be after check-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }


    @Override
    public String toString() {
        return "Reservation | " +
                "numberRoom=" + numberRoom +
                ", checkIn=" + this.checkIn.format(fmt) +
                ", checkOut=" + this.checkOut.format(fmt) + "Nigths:" +  this.duaratoinDays().toDays() + " |";
    }
}