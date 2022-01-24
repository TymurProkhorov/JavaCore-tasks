import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class DateBetweenTwoDatesTest {
    @Test
    void DateBetweenTwoDatesTest() {
        LocalDateTime firstDate = LocalDateTime.of(2022, Month.MAY, 20,3, 1);
        LocalDateTime myDate = LocalDateTime.of(2100, Month.DECEMBER, 31, 3, 0);
        LocalDateTime secondDate = LocalDateTime.of(2222, Month.JULY, 12, 11, 0);

        assertTrue(DateBetweenTwoDates.isBetween(firstDate, secondDate, myDate));
    }
}