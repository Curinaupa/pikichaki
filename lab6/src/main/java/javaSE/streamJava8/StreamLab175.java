package javaSE.streamJava8;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 Create new project called TestDateTime.
 Add package “com.brainacad.oop.testapidate”. Create a class Main with a main() method, which:
 1) Determine and output the current date and the date of birth, and then define and output the number of your years;
 2) Determine in which day of the week you were born and what day of the week will be the birthday of this year,
 then determine was whether this year's birthday;
 3) Define a new date and time format (example, "dd.MM.yyyy, HH-mm-ss"). Then determine the current date and time for the multiple
 time-zones and output them in a new format.
 */
public class StreamLab175 {
    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();
        System.out.println("Today is : " + dateNow);
        LocalDate birthDay = LocalDate.of(1974, 07,23);

        System.out.println("Birthday : " + birthDay);
        Period p = birthDay.until(dateNow);
        System.out.println(p.getYears());


        System.out.println("You born day was on "+birthDay.getDayOfWeek());
        System.out.println("Your birthday Day will be on : " + birthDay.plus(43, ChronoUnit.YEARS).getDayOfWeek());

        Period years = Period.between(birthDay, dateNow);
        System.out.println("You are "+ years.getYears() +" years old "+ years.getMonths() + " months " + years.getDays() + " days");

        if (years.isNegative()){
            System.out.println("Already past");
        }else if (years.isZero()){
            System.out.println("Toady is your birthday");
        }else{
            System.out.println("Will be soon");
        }

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.toInstant());

        Date newDate = new Date();
        System.out.println(newDate);
        String dateStr = DateTimeFormatter.ofPattern("MM d YYYY г").withLocale(new Locale("ru")).format(dateNow);
        System.out.println(dateStr);

        Instant instant = Instant.now();
        ZoneId kiev = ZoneId.of("Europe/Kiev");
        ZoneId lima = ZoneId.of("America/Lima");
        LocalDateTime kievDateTime= LocalDateTime.now();
        ZonedDateTime zoneKiev = ZonedDateTime.of(kievDateTime, kiev);
        System.out.println(zoneKiev);
        ZonedDateTime zoneLima = zoneKiev.withZoneSameInstant(lima);
        System.out.println(zoneLima);
        System.out.println(zoneLima.toLocalDateTime());


    }
}