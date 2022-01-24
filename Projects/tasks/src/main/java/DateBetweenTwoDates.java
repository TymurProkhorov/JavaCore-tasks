import java.time.LocalDateTime;
import java.time.Month;

public class DateBetweenTwoDates {
    public static void main(String[] args) {
        LocalDateTime firstDate = LocalDateTime.of(2022, Month.MAY, 20,3, 1);
        LocalDateTime myDate = LocalDateTime.of(2100, Month.DECEMBER, 31, 3, 0);
        LocalDateTime secondDate = LocalDateTime.of(2222, Month.JULY, 12, 11, 0);

        System.out.println(isBetween(firstDate, secondDate, myDate));
    }

    static boolean isBetween(LocalDateTime firstDate, LocalDateTime secondDate, LocalDateTime myDate) {
        return firstDate.isBefore(myDate) && secondDate.isAfter(myDate);
    }
}