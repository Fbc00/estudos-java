import java.awt.event.WindowStateListener;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
//        LocalDate agora = LocalDate.now();
//        LocalDateTime agoraTime = LocalDateTime.now();
//        Instant agoraTimeGMT = Instant.now();
//
//        LocalDate agoraStrnig = LocalDate.parse("2022-12-31");
//        LocalDateTime agoraTimeString = LocalDateTime.parse("2022-07-20T01:30:26");
//
//        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy");
//
//        LocalDate fmDate = LocalDate.parse("21/12/2022", fmt);
//        LocalDate fmPormembro = LocalDate.of(2022, 12, 21);
//        System.out.println(agora);
//        System.out.println(agoraTime);
//        System.out.println(agoraTimeGMT);
//        System.out.println(agoraStrnig);
//        System.out.println(agoraTimeString);
//        LocalDate agora = LocalDate.now();
//        LocalDateTime agoraTime = LocalDateTime.now();
//        Instant agoraTimeGMT = Instant.now();
//        Instant agoraTimeGMTZ = Instant.parse("2022-07-20T01:30:39Z");
//        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy");
//        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm").withZone(ZoneId.systemDefault());
//
//        System.out.println(agora.format(fmt));
//        System.out.println(fmt1.format(agoraTimeGMTZ));

//        LocalDate r1 = LocalDate.ofInstant(agoraTimeGMT, ZoneId.systemDefault());
//        LocalDate r2 = LocalDate.ofInstant(agoraTimeGMT, ZoneId.of("Portugal"));
//        System.out.println(r1);
//        System.out.println(r2);
//
//        System.out.println(agoraTime.getDayOfMonth());
        LocalDate agora = LocalDate.parse("2022-12-31"); // apenas data
        LocalDateTime agoraTime = LocalDateTime.now(); // data com hor
        Instant agoraTimeGMT = Instant.parse("2022-07-20T01:30:39Z");
        LocalDate agoraUmaSemanaAntes = agora.minusWeeks(1);
        LocalDateTime agoraTimeSomas = agoraTime.plusHours(3);
        Instant agoraTimeGMTSOMAS = agoraTimeGMT.plus(2, ChronoUnit.DAYS);
//        System.out.println(agoraUmaSemanaAntes);
//        System.out.println(agoraTimeSomas);
//        System.out.println(agoraTimeGMTSOMAS);

        Duration t1 = Duration.between(agoraTime, agoraTimeSomas);
        Duration t2 = Duration.between(agora.atStartOfDay(), agoraUmaSemanaAntes.atStartOfDay());

        System.out.println(t1.toHours());





    }
}